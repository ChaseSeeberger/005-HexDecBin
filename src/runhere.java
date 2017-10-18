import javax.swing.JOptionPane;

public class runhere {

	public static void main(String[] args) {
		String base = "";
		String message = "";
		Boolean repeat = true;
		String repeat2 = "Yes";
		
		/* BinPower binpower = new BinPower();
		binpower.setBinary(); 
		baseConverter.convert();
		 */
		while (repeat == true) {
			HexDecBin baseConverter = new HexDecBin();
			message = "What base do you want to start from? (Hex, Dec, Bin)";
			base = JOptionPane.showInputDialog(message);
		
			if (base.equals("Hex")) {
				baseConverter.getHexNumber();
			} else if (base.equals("Dec")) {
				baseConverter.getDecNumber();
			} else if (base.equals("Bin")) {
				baseConverter.getBinNumber();
			} else {
			
			}
			message = "do you want to go again? (Yes/No)";
			repeat2 = JOptionPane.showInputDialog(message);
		
			if (repeat2.equals("Yes")) {
				repeat = true;
			} else {
				repeat = false;
			}
		}
	}
}
