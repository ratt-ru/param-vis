import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;


public class source_page {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void SourceData() {
		try {
			source_page window = new source_page();
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
		shell.setText("Source A Data");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnNewButton_1.setBounds(114, 10, 98, 30);
		btnNewButton_1.setText("pol 1");
		
		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnNewButton_2.setBounds(10, 46, 98, 30);
		btnNewButton_2.setText("Antenna 1");
		
		Button btnAntenna = new Button(shell, SWT.NONE);
		btnAntenna.setText("Antenna 2");
		btnAntenna.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnAntenna.setBounds(10, 82, 98, 30);
		
		Button btnAntenna_1 = new Button(shell, SWT.NONE);
		btnAntenna_1.setText("Antenna 3");
		btnAntenna_1.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnAntenna_1.setBounds(10, 118, 98, 30);
		
		Button btnAntenna_2 = new Button(shell, SWT.NONE);
		btnAntenna_2.setText("Antenna 4");
		btnAntenna_2.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnAntenna_2.setBounds(10, 154, 98, 30);
		
		Button btnPol = new Button(shell, SWT.NONE);
		btnPol.setText("pol 2");
		btnPol.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnPol.setBounds(218, 10, 98, 30);
		
		Button btnPol_1 = new Button(shell, SWT.NONE);
		btnPol_1.setText("pol 3");
		btnPol_1.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnPol_1.setBounds(322, 10, 98, 30);
		
		Button btnPol_2 = new Button(shell, SWT.NONE);
		btnPol_2.setText("pol 4");
		btnPol_2.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnPol_2.setBounds(428, 10, 98, 30);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				Plot_graph nw = new Plot_graph();
				nw.GraphScreen();
			}
		});
		btnNewButton.setBounds(114, 46, 98, 30);
		
		Button button = new Button(shell, SWT.NONE);
		button.setBounds(114, 82, 98, 30);
		
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.setBounds(114, 118, 98, 30);
		
		Button button_2 = new Button(shell, SWT.NONE);
		button_2.setBounds(114, 154, 98, 30);
		
		Button button_3 = new Button(shell, SWT.NONE);
		button_3.setBounds(218, 154, 98, 30);
		
		Button button_4 = new Button(shell, SWT.NONE);
		button_4.setBounds(218, 118, 98, 30);
		
		Button button_5 = new Button(shell, SWT.NONE);
		button_5.setBounds(218, 82, 98, 30);
		
		Button button_6 = new Button(shell, SWT.NONE);
		button_6.setBounds(218, 46, 98, 30);
		
		Button button_7 = new Button(shell, SWT.NONE);
		button_7.setBounds(428, 154, 98, 30);
		
		Button button_8 = new Button(shell, SWT.NONE);
		button_8.setBounds(428, 118, 98, 30);
		
		Button button_9 = new Button(shell, SWT.NONE);
		button_9.setBounds(428, 82, 98, 30);
		
		Button button_10 = new Button(shell, SWT.NONE);
		button_10.setBounds(428, 46, 98, 30);
		
		Button button_11 = new Button(shell, SWT.NONE);
		button_11.setBounds(324, 46, 98, 30);
		
		Button button_12 = new Button(shell, SWT.NONE);
		button_12.setBounds(324, 82, 98, 30);
		
		Button button_13 = new Button(shell, SWT.NONE);
		button_13.setBounds(324, 118, 98, 30);
		
		Button button_14 = new Button(shell, SWT.NONE);
		button_14.setBounds(324, 154, 98, 30);

	}

}
