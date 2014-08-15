import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;


public class antenna_source {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			antenna_source window = new antenna_source();
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
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(550, 400);
		shell.setText("Summary");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				source_page nw = new source_page();
				nw.SourceData();
			}
		});
		btnNewButton.setBounds(114, 46, 98, 30);
		btnNewButton.setText("Source A");
		
		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				antenna_page nw1 = new antenna_page();
				nw1.AntennaData();
			}
		});
		btnNewButton_2.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnNewButton_2.setBounds(10, 82, 98, 30);
		btnNewButton_2.setText("Antenna 1");
		
		Button btnSourceB = new Button(shell, SWT.NONE);
		btnSourceB.setText("Source B");
		btnSourceB.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnSourceB.setBounds(218, 46, 98, 30);
		
		Button btnSourceC = new Button(shell, SWT.NONE);
		btnSourceC.setText("Source C");
		btnSourceC.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnSourceC.setBounds(322, 46, 98, 30);
		
		Button btnSourceD = new Button(shell, SWT.NONE);
		btnSourceD.setText("Source D");
		btnSourceD.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnSourceD.setBounds(426, 46, 98, 30);
		
		Button btnAntenna = new Button(shell, SWT.NONE);
		btnAntenna.setText("Antenna 2");
		btnAntenna.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnAntenna.setBounds(10, 118, 98, 30);
		
		Button btnAntenna_1 = new Button(shell, SWT.NONE);
		btnAntenna_1.setText("Antenna 3");
		btnAntenna_1.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnAntenna_1.setBounds(10, 154, 98, 30);
		
		Button btnAntenna_2 = new Button(shell, SWT.NONE);
		btnAntenna_2.setText("Antenna 4");
		btnAntenna_2.setFont(SWTResourceManager.getFont("Ubuntu", 11, SWT.BOLD));
		btnAntenna_2.setBounds(10, 190, 98, 30);
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				value_page nw2 = new value_page();
				nw2.ValueData();
			}
		});
		button.setBounds(114, 82, 98, 30);
		
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.setBounds(114, 118, 98, 30);
		
		Button button_2 = new Button(shell, SWT.NONE);
		button_2.setBounds(114, 154, 98, 30);
		
		Button button_3 = new Button(shell, SWT.NONE);
		button_3.setBounds(114, 190, 98, 30);
		
		Button button_4 = new Button(shell, SWT.NONE);
		button_4.setBounds(218, 190, 98, 30);
		
		Button button_5 = new Button(shell, SWT.NONE);
		button_5.setBounds(218, 154, 98, 30);
		
		Button button_6 = new Button(shell, SWT.NONE);
		button_6.setBounds(218, 118, 98, 30);
		
		Button button_7 = new Button(shell, SWT.NONE);
		button_7.setBounds(218, 82, 98, 30);
		
		Button button_8 = new Button(shell, SWT.NONE);
		button_8.setBounds(322, 190, 98, 30);
		
		Button button_9 = new Button(shell, SWT.NONE);
		button_9.setBounds(322, 154, 98, 30);
		
		Button button_10 = new Button(shell, SWT.NONE);
		button_10.setBounds(322, 118, 98, 30);
		
		Button button_11 = new Button(shell, SWT.NONE);
		button_11.setBounds(322, 82, 98, 30);
		
		Button button_12 = new Button(shell, SWT.NONE);
		button_12.setBounds(426, 190, 98, 30);
		
		Button button_13 = new Button(shell, SWT.NONE);
		button_13.setBounds(426, 154, 98, 30);
		
		Button button_14 = new Button(shell, SWT.NONE);
		button_14.setBounds(426, 118, 98, 30);
		
		Button button_15 = new Button(shell, SWT.NONE);
		button_15.setBounds(426, 82, 98, 30);

	}
}
