import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;


public class antenna_page {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void AntennaData() {
		try {
			antenna_page window = new antenna_page();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(550, 300);
		shell.setText("Antenna 1 Data");
		
		Button btnPol = new Button(shell, SWT.NONE);
		btnPol.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnPol.setText("pol 1");
		btnPol.setBounds(114, 10, 98, 30);
		
		Button btnSource = new Button(shell, SWT.NONE);
		btnSource.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnSource.setText("Source A");
		btnSource.setBounds(10, 46, 98, 30);
		
		Button btnPol_1 = new Button(shell, SWT.NONE);
		btnPol_1.setText("pol 2");
		btnPol_1.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnPol_1.setBounds(218, 10, 98, 30);
		
		Button btnPol_2 = new Button(shell, SWT.NONE);
		btnPol_2.setText("pol 3");
		btnPol_2.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnPol_2.setBounds(322, 10, 98, 30);
		
		Button btnPol_3 = new Button(shell, SWT.NONE);
		btnPol_3.setText("pol 4");
		btnPol_3.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnPol_3.setBounds(426, 10, 98, 30);
		
		Button btnSourceB = new Button(shell, SWT.NONE);
		btnSourceB.setText("Source B");
		btnSourceB.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnSourceB.setBounds(10, 82, 98, 30);
		
		Button btnSourceC = new Button(shell, SWT.NONE);
		btnSourceC.setText("Source C");
		btnSourceC.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnSourceC.setBounds(10, 118, 98, 30);
		
		Button btnSourceD = new Button(shell, SWT.NONE);
		btnSourceD.setText("Source D");
		btnSourceD.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnSourceD.setBounds(10, 154, 98, 30);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				Plot_graph nw = new Plot_graph();
				nw.GraphScreen();
			}
		});
		btnNewButton.setBounds(114, 46, 98, 30);
		
		Button button_6 = new Button(shell, SWT.NONE);
		button_6.setBounds(114, 82, 98, 30);
		
		Button button_7 = new Button(shell, SWT.NONE);
		button_7.setBounds(114, 118, 98, 30);
		
		Button button_8 = new Button(shell, SWT.NONE);
		button_8.setBounds(114, 154, 98, 30);
		
		Button button_9 = new Button(shell, SWT.NONE);
		button_9.setBounds(218, 154, 98, 30);
		
		Button button_10 = new Button(shell, SWT.NONE);
		button_10.setBounds(218, 118, 98, 30);
		
		Button button_11 = new Button(shell, SWT.NONE);
		button_11.setBounds(218, 82, 98, 30);
		
		Button button_12 = new Button(shell, SWT.NONE);
		button_12.setBounds(218, 46, 98, 30);
		
		Button button_13 = new Button(shell, SWT.NONE);
		button_13.setBounds(322, 154, 98, 30);
		
		Button button_14 = new Button(shell, SWT.NONE);
		button_14.setBounds(322, 118, 98, 30);
		
		Button button_15 = new Button(shell, SWT.NONE);
		button_15.setBounds(322, 82, 98, 30);
		
		Button button_16 = new Button(shell, SWT.NONE);
		button_16.setBounds(322, 46, 98, 30);
		
		Button button_17 = new Button(shell, SWT.NONE);
		button_17.setBounds(426, 154, 98, 30);
		
		Button button_18 = new Button(shell, SWT.NONE);
		button_18.setBounds(426, 118, 98, 30);
		
		Button button_19 = new Button(shell, SWT.NONE);
		button_19.setBounds(426, 82, 98, 30);
		
		Button button_20 = new Button(shell, SWT.NONE);
		button_20.setBounds(426, 46, 98, 30);

	}

}
