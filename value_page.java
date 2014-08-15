import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;


public class value_page {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void ValueData() {
		try {
			value_page window = new value_page();
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
		shell.setSize(550, 400);
		shell.setText("Source A Antenna 1 Data");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnNewButton_1.setBounds(116, 10, 98, 30);
		btnNewButton_1.setText("pol 1");
		
		Button btnPol = new Button(shell, SWT.NONE);
		btnPol.setText("pol 2");
		btnPol.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnPol.setBounds(220, 10, 98, 30);
		
		Button btnPol_1 = new Button(shell, SWT.NONE);
		btnPol_1.setText("pol 3");
		btnPol_1.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnPol_1.setBounds(324, 10, 98, 30);
		
		Button btnPol_2 = new Button(shell, SWT.NONE);
		btnPol_2.setText("pol 4");
		btnPol_2.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnPol_2.setBounds(428, 10, 98, 30);
		
		Button button_3 = new Button(shell, SWT.NONE);
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				Plot_graph nw = new Plot_graph();
				nw.GraphScreen();
			}
		});
		button_3.setBounds(116, 46, 98, 30);
		
		Button button_4 = new Button(shell, SWT.NONE);
		button_4.setBounds(116, 83, 98, 30);
		
		Button button_5 = new Button(shell, SWT.NONE);
		button_5.setBounds(116, 119, 98, 30);
		
		Button button_6 = new Button(shell, SWT.NONE);
		button_6.setBounds(116, 155, 98, 30);
		
		Button button_7 = new Button(shell, SWT.NONE);
		button_7.setBounds(220, 155, 98, 30);
		
		Button button_8 = new Button(shell, SWT.NONE);
		button_8.setBounds(220, 119, 98, 30);
		
		Button button_9 = new Button(shell, SWT.NONE);
		button_9.setBounds(220, 83, 98, 30);
		
		Button button_10 = new Button(shell, SWT.NONE);
		button_10.setBounds(220, 46, 98, 30);
		
		Button button_11 = new Button(shell, SWT.NONE);
		button_11.setBounds(428, 155, 98, 30);
		
		Button button_12 = new Button(shell, SWT.NONE);
		button_12.setBounds(428, 119, 98, 30);
		
		Button button_13 = new Button(shell, SWT.NONE);
		button_13.setBounds(428, 83, 98, 30);
		
		Button button_14 = new Button(shell, SWT.NONE);
		button_14.setBounds(428, 46, 98, 30);
		
		Button button_15 = new Button(shell, SWT.NONE);
		button_15.setBounds(324, 46, 98, 30);
		
		Button button_16 = new Button(shell, SWT.NONE);
		button_16.setBounds(324, 83, 98, 30);
		
		Button button_17 = new Button(shell, SWT.NONE);
		button_17.setBounds(324, 119, 98, 30);
		
		Button button_18 = new Button(shell, SWT.NONE);
		button_18.setBounds(324, 155, 98, 30);

	}

}
