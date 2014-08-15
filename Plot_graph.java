import java.awt.*;
import javax.swing.*;

public class Plot_graph extends JFrame{

	public Plot_graph()
	{
		setTitle("Graph of antenna, source and pol");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g)
	{
		g.drawLine(50, 50, 50, 450);
		g.drawLine(50, 450, 450, 450);
		/* 
		 * Not sure why background is coming through 
		*/
		/*g.drawString("Antenna", 250,470);
		g.drawString("S", 30, 200);
		g.drawString("O", 30, 215);
		g.drawString("U", 30, 230);
		g.drawString("R", 30, 245);
		g.drawString("C", 30, 260);
		g.drawString("E", 30, 275);*/
		
		g.setColor(Color.GREEN);
		g.drawLine(50, 450, 70, 400);
		g.drawLine(70, 400, 200, 300);
		g.drawLine(200, 300, 250, 170);
		g.drawLine(250, 170, 350, 70);
		g.drawLine(350, 70, 450, 200);
		g.setColor(Color.BLUE);
		g.fillOval(65, 395, 10, 10);
		g.fillOval(195, 295, 10, 10);
		g.fillOval(245, 165, 10, 10);
		g.fillOval(345, 65, 10, 10);
		g.fillOval(445, 195, 10, 10);
		
		g.setColor(Color.RED);
		int[] x = {50,80,240,300,400};
		int[] y = {80,420,300,350,180};
		g.drawPolyline(x,y,5);
	}
	
	public static void GraphScreen()
	{
		Plot_graph p = new Plot_graph();
	}
}



