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
	
	public void hexToDec() {
		message = "Enter the hex number :";
		hex = JOptionPane.showInputDialog(message);
		
		message = "You have entered hex value " + hex + " Decimal vaule is: " + num;
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void hexToBin() {
		message = "Enter the hex number :";
		hex = JOptionPane.showInputDialog(message);
		num = Integer.parseInt(hex, 16);
		bin = Integer.toBinaryString(num);
		message = "You have entered hex value " + hex + " Binary value is: " + bin;
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void binToHex() {
		message = "Enter the binary number :";
		bin = JOptionPane.showInputDialog(message);
		num = Integer.parseInt(bin, 2);
		hex = Integer.toHexString(num);
		message = "You have entered binary value: " + bin + " hex value is: " + hex;
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void binToDec() {
		message = "Enter the binary number :";
		bin = JOptionPane.showInputDialog(message);
		num = Integer.parseInt(bin, 2);
		dec = Integer.toString(num);
		message = "You have entered binary value: " + bin + " Decimal vaule is: " + dec;
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void decToHex() {
		message = "Enter the decimal number :";
		dec = JOptionPane.showInputDialog(message);
		num = Integer.parseInt(dec);
		hex = Integer.toHexString(num);
		message = "You have entered decimal value " + dec + " hex vaule is: " + hex;
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void decToBin() {
		message = "Enter the decimal number :";
		dec = JOptionPane.showInputDialog(message);
		num = Integer.parseInt(dec);
		bin = Integer.toBinaryString(num);
		message = "You have entered decimal value " + dec + " Binary value is: " + bin;
		JOptionPane.showMessageDialog(null, message);
	}
	
	
}

/*************************************
 * FIX FAULTS COMPLETE MISSING CODE!
 * 
 * 
 */

