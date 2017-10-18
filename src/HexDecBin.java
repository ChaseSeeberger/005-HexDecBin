import javax.swing.JOptionPane;

public class HexDecBin {

	String name = "";
	String hex = "";
	String bin = "";
	String dec = "";
	String message = "";
	String base = "";
	int num = 0;
	
	//test
	
	public String HexDecBinBase() {
		message = "Welcome to my hexadecimal, decimal, or binary converstion program! What is your name?";
		name = JOptionPane.showInputDialog(message);
		
		message = "Very nice to meet you " + name + " let's begin: \n";
		JOptionPane.showMessageDialog(null, message);
		
		message = "What base do you want to start with? Hex Dec or Bin?";
		base = JOptionPane.showInputDialog(message);
		return base;
	}
	

	public void getHexNumber() {
		message = "Enter the hex number :";
		hex = JOptionPane.showInputDialog(message);
		num = Integer.parseInt(hex, 16);
		bin = Integer.toBinaryString(num);
		
		message = "You have entered hex value " + hex + " Decimal vaule is: " + num + " Binary value is: " + bin;
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void getBinNumber() {
		message = "Enter the binary number :";
		bin = JOptionPane.showInputDialog(message);
		num = Integer.parseInt(bin, 2);
		dec = Integer.toString(num);
		hex = Integer.toHexString(num);
		
		message = "You have entered binary value: " + bin + " Decimal vaule is: " + dec + " hex value is: " + hex;
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void getDecNumber() {
		message = "Enter the decimal number :";
		dec = JOptionPane.showInputDialog(message);
		num = Integer.parseInt(dec);
		hex = Integer.toHexString(num);
		bin = Integer.toBinaryString(num);
		
		message = "You have entered decimal value " + dec + " hex vaule is: " + hex + " Binary value is: " + bin;
		JOptionPane.showMessageDialog(null, message);
	}
	
	void convert() {
		
		String binary = Integer.toBinaryString(num);
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

/*************************************
 * FIX FAULTS COMPLETE MISSING CODE!
 * 
 * 
 */

