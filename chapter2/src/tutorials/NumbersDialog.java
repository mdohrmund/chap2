package tutorials;

import javax.swing.JOptionPane;

public class NumbersDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int creditDays = 30;
		int days= 5, weeks = 7, months =12;
		JOptionPane.showMessageDialog(null, " " + creditDays);
		JOptionPane.showMessageDialog(null, "Every bill is due in" + creditDays + "days");
		
	}

}
