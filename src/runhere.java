import javax.swing.JOptionPane;

public class runhere {

	public static void main(String[] args) {
		String baseStart = "";
		String baseEnd = "";
		String message = "";
		Boolean repeat = true;
		String repeat2 = "Yes";
		
		message = "Hello, what is your name?";
		String name = JOptionPane.showInputDialog(message);
		message = "Welcome " + name + "! Lets start!";
		JOptionPane.showMessageDialog(null, message);
		
		while (repeat == true) {
			HexDecBin baseConverter = new HexDecBin();
			message = "What base do you want to start from? (Hex, Dec, Bin)";
			baseStart = JOptionPane.showInputDialog(message);
			message = "What base do you want to convert to? (Hex, Dec, Bin)";
			baseEnd = JOptionPane.showInputDialog(message);
			
			if (baseStart.equals("Hex") & baseEnd.equals("Dec")) {
				baseConverter.hexToDec();
			} else if (baseStart.equals("Hex") & baseEnd.equals("Bin")) {
				baseConverter.hexToBin();
			} else if (baseStart.equals("Dec") & baseEnd.equals("Hex")) {
				baseConverter.decToHex();
			} else if (baseStart.equals("Dec") & baseEnd.equals("Bin")) {
				baseConverter.decToBin();
			} else if (baseStart.equals("Bin") & baseEnd.equals("Hex")) {
				baseConverter.binToHex();
			} else if (baseStart.equals("Bin") & baseEnd.equals("Dec")) {
				baseConverter.binToDec();
			}
			message = name + "! Do you want to go again? (Yes/No)";
			repeat2 = JOptionPane.showInputDialog(message);
		
			if (repeat2.equals("No")) {
				repeat = false;
			}
			
		}
		//BinPower binpower = new BinPower();
		//binpower.setBinary(); 
		//binpower.convert();
	}
}
/*
	Grading /////
	
	1. All JOP's
	2.Runnable jar
	3. ask for name, repeat name with hello...
	4. What base are we starting with, Hex Dec Bin?
	5. what base are we converting too? Hex Dec Bin?
	6. Entering starting value
	7. Do conversions and display results
	8. Ask if they want to go again.

*/