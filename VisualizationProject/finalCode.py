import cPickle
import matplotlib.pyplot as plt
import numpy
import os
import sys

filename = sys.argv[1]
print filename
DG0 = cPickle.load(file(filename))
DG = DG0['gains']
srcnames = sorted(DG.keys())
with open('testing.npy', 'w') as fout:
    fout.write('')
fout.close()

myf = open('testing.npy','r+')

# This gets the numbers of the antennas
keys = sorted(DG[srcnames[0]]['solutions'].keys())
myf.write(str(len(srcnames))+" "+str(len(keys))+"\n")
ant = sorted(DG[srcnames[0]]['solutions'].keys())
myf.write(str(ant)+"\n")

for i in range(0,len(srcnames)):
	
	"""
	DG[srcnames[5]]['solutions']['x'][0][0][0] --> for sources  / src_page
	DG[srcnames[x]]['solutions']['1'][0][0][0] --> for ant      / ant_page
	DG[srcnames[x]]['solutions']['x'][0][0][0] --> for ant/src  / ant_src
	"""
	## antena number
	keys = sorted(DG[srcnames[i]]['solutions'].keys())
	
	for j in range(0,len(keys)):
		myf.write("src " +str(i)+" ant " +str(keys[j])+" \n")
		ant = DG[srcnames[i]]['solutions'][keys[j]]
		for amountOfSubArrays in range(0,len(ant)):
			try: length = len(ant[amountOfSubArrays])
			except TypeError: length = 0 
			if length > 0:
				for subElements in range(0,len(ant[amountOfSubArrays])):
					try: length = len(ant[amountOfSubArrays][subElements])
					except TypeError: length = 0
					if length > 0: 
						myf.write("["+str(amountOfSubArrays)+"]["+str(subElements)+"]:\n")
						count = 1
						for indiElements in range(0,len(ant[amountOfSubArrays][subElements])):
							if count < (len(ant[amountOfSubArrays][subElements])/5):
								myf.write(str(ant[amountOfSubArrays][subElements][indiElements]) + " ")	
							else:
								myf.write(str(ant[amountOfSubArrays][subElements][indiElements]) + " \n")
								count = 0	
							count=count+1
					
						
			else:
				myf.write("["+str(amountOfSubArrays)+"][0]:\nempty\n")


myf.close()





index2 = filename.find('.')
directory = filename[:index2]
# Creates directory containing images only if directory doesn't exist as if it does exist the images were already created
if not os.path.exists(directory):
	os.makedirs(directory)
	path = directory
	ncols = len(srcnames)
	antennas = sorted(DG[srcnames[0]]['solutions'].keys(),lambda a,b:cmp(int(a),int(b)));
	for ant in antennas:
	  plt.figure(figsize=(5*ncols,3*8))
	  for i,src in enumerate(sorted(srcnames)):
	    sols = DG[src]['solutions'][ant]
	    for j,xx in enumerate(("RR","RL","LR","LL")):
	      if not hasattr(sols[j],'shape'):
		continue;
	      ntime,nfreq = sols[j].shape;
	      plt.subplot(8,ncols,j*2*ncols+i+1)
	      if nfreq>1:
		x = range(ntime);
		plt.fill_between(x,abs(sols[j][:,0]),abs(sols[j][:,-1]),color='grey')
		plt.plot(abs(sols[j][:,nfreq/2]))
	      else:
		plt.plot(abs(sols[j][:,0]))
	      plt.title("%s:%s:%s:ampl"%(src,ant,xx));
	      plt.xticks([]);
	      plt.xlim(0,ntime-1)
	      plt.subplot(8,ncols,(j*2+1)*ncols+i+1)
	      ph = numpy.angle(sols[j])*180/numpy.pi;
	      if nfreq>1:
		plt.plot(ph[:,0],'.',ms=0.5,mec='0.2')
		plt.plot(ph[:,-1],'.',ms=0.5,mec='0.2')
		plt.plot(ph[:,nfreq/2],'.b',ms=0.5)
	      else:
		plt.plot(ph[:,0],'.',ms=0.5)
	      plt.title("%s:%s:%s:phase (deg)"%(src,ant,xx));
	      plt.xticks([]);
	      plt.xlim(0,ntime-1)
	  
	  filename2 = "ant-%s.png"%(ant)
	  filename2 = os.path.join(path,filename2)
	  plt.savefig(filename2,dpi=150);


