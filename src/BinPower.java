import java.util.Scanner;

import javax.swing.JOptionPane;

public class BinPower {

	//Fixed Scanner bug
	
	Scanner input = new Scanner(System.in);
	String name = "";
	String message = "";
	double exp = 0;
	double base = 0;
	double answer;
	
	public BinPower(){
		
	}
	
	public void setBinary() {
		base = 2;
		message = "What Binary Exponent do you want?";
		JOptionPane.showInputDialog(message);
		answer = (int) Math.pow(base, exp);
		message = "ans = " + answer;
		JOptionPane.showMessageDialog(null, message);
	}
	void convert() {
		
		String binary = Integer.toBinaryString((int) answer);
		int numberBites = binary.length();
		int bite = 8;
		int nibble = 4;
		int nibbleAnswer = 4, nibbleRemainder = 0;
		int byteAnswer = 8, byteRemainder = 0;
		
		message = "Binary value is: " + binary;
		JOptionPane.showMessageDialog(null, message);
		
		message = "Number of bits is " + numberBites;
		JOptionPane.showMessageDialog(null, message);
		

		nibbleAnswer = numberBites/nibble;
		nibbleRemainder = numberBites%nibble;
		byteAnswer = numberBites/bite;
		byteRemainder = numberBites%bite;
		message = "Number of whole nibbles is " + nibbleAnswer + " and " + nibbleRemainder + " remainding nibbles";
		JOptionPane.showMessageDialog(null, message); 
		message = "Number of whole bytes is " + byteAnswer + " and " + byteRemainder + " remainding bytes";
		JOptionPane.showMessageDialog(null, message);
	}

}
