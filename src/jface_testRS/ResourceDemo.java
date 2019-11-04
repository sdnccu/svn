package jface_testRS;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;

public class ResourceDemo {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ResourceDemo window = new ResourceDemo();
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
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		Button btnUsingJfacers = new Button(shell, SWT.NONE);
		btnUsingJfacers.setText("using JFaceRS");
		
		Button btnUsing = new Button(shell, SWT.NONE);
		btnUsing.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		btnUsing.setFont(SWTResourceManager.getFont("Microsoft JhengHei UI", 13, SWT.NORMAL));
		btnUsing.setImage(SWTResourceManager.getImage(ResourceDemo.class, "/jface_testphh/check.png"));
		btnUsing.setText("using SWTrs");

	}

}
