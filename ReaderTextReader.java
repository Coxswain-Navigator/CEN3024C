import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.wb.swt.SWTResourceManager;
import org.junit.jupiter.api.Test;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class ReaderTextReader {

	protected Shell input1_lbl;
	private Text userinput_txt;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ReaderTextReader window = new ReaderTextReader();
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
		input1_lbl.open();
		input1_lbl.layout();
		while (!input1_lbl.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		input1_lbl = new Shell();
		input1_lbl.setSize(960, 575);
		input1_lbl.setText("SWT Application");
		input1_lbl.setLayout(new GridLayout(10, false));
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		
		Label description_lbl = new Label(input1_lbl, SWT.NONE);
		description_lbl.setText("Type a number between 1-30");
		description_lbl.setFont(SWTResourceManager.getFont("Segoe UI", 30, SWT.NORMAL));
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		
		userinput_txt = new Text(input1_lbl, SWT.BORDER);
		userinput_txt.setFont(SWTResourceManager.getFont("Segoe UI", 30, SWT.NORMAL));
		userinput_txt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(input1_lbl, SWT.NONE);
		
		Label word_lbl = new Label(input1_lbl, SWT.NONE);
		word_lbl.setFont(SWTResourceManager.getFont("Segoe UI", 30, SWT.NORMAL));
		word_lbl.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		word_lbl.setText("Word");
		
		Label wordresult_lbl = new Label(input1_lbl, SWT.NONE);
		wordresult_lbl.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 8, 1));
		wordresult_lbl.setText("Enter a valid number");
		wordresult_lbl.setFont(SWTResourceManager.getFont("Segoe UI", 30, SWT.NORMAL));
		new Label(input1_lbl, SWT.NONE);
		
		Label occurances_lbl = new Label(input1_lbl, SWT.NONE);
		occurances_lbl.setFont(SWTResourceManager.getFont("Segoe UI", 30, SWT.NORMAL));
		occurances_lbl.setText("Occurances");
		
		Label occurancesresult_lbl = new Label(input1_lbl, SWT.NONE);
		occurancesresult_lbl.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 8, 1));
		occurancesresult_lbl.setText("-99");
		occurancesresult_lbl.setFont(SWTResourceManager.getFont("Segoe UI", 30, SWT.NORMAL));
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		new Label(input1_lbl, SWT.NONE);
		
		Button nextword_btn = new Button(input1_lbl, SWT.NONE);
		nextword_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				int given = Integer.parseInt(userinput_txt.getText());
				int resultnumber = 0;
				String resultletter = "Nothing";
				
				switch (given) {
				case 0 :
					resultnumber = 0;
					resultletter = "Nothing";
					break;
				case 1 :
					resultnumber = 14;
					resultletter = "door";
					break;
				case 2 :
					resultnumber = 11;
					resultletter = "raven";
					break;
				case 3 :
					resultnumber = 11;
					resultletter = "chamber";
					break;
				case 4 :
					resultnumber = 11;
					resultletter = "nevermore";
					break;
				case 5 :
					resultnumber = 10;
					resultletter = "bird";
					break;
				case 6 :
					resultnumber = 8;
					resultletter = "lenore";
					break;
				case 7 :
					resultnumber = 7;
					resultletter = "nothing";
					break;
				case 8 :
					resultnumber = 7;
					resultletter = "still";
					break;
				case 9 :
					resultnumber = 7;
					resultletter = "soul";
					break;
				case 10 :
					resultnumber = 7;
					resultletter = "said";
					break;
				case 11 :
					resultnumber = 7;
					resultletter = "thy";
					break;
				case 12 :
					resultnumber = 7;
					resultletter = "bust";
					break;
				case 13 :
					resultnumber = 7;
					resultletter = "upon";
					break;
				case 14 :
					resultnumber = 7;
					resultletter = "tapping";
					break;
				case 15 :
					resultnumber = 5;
					resultletter = "name";
					break;
				case 16 :
					resultnumber = 5;
					resultletter = "word";
					break;
				case 17 :
					resultnumber = 5;
					resultletter = "tell";
					break;
				case 18 :
					resultnumber = 5;
					resultletter = "quoth";
					break;
				case 19 :
					resultnumber = 4;
					resultletter = "one";
					break;
				case 20 :
					resultnumber = 4;
					resultletter = "floor";
					break;
				}
				
				occurancesresult_lbl.setText(Integer.toString(resultnumber));
				wordresult_lbl.setText(resultletter);
				
				
			}
		});
		nextword_btn.setFont(SWTResourceManager.getFont("Segoe UI", 30, SWT.NORMAL));
		nextword_btn.setText("Check word");

	}
	@Test //This is a demonstration that should usually fail.
	void test() { 
	int given = 0;;
	int resultnumber = 0;
	String resultletter = "Nothing";
		assertEquals("0", given);
		assertEquals("0", resultnumber);
		assertEquals("Nothing", resultletter);
	}

}
