import java.util.Scanner;

public class BinPower {

	//Fixed Scanner bug
	
	Scanner input = new Scanner(System.in);
	String name = "";
	
	public BinPower(){
		
	}
	
	public void setBinary() {
		
		double exp = 0;
		double base = 0;
		double answer;
		
		System.out.println("What is your name?" );
		name = input.nextLine();
		base = 2;
		System.out.println("What Binary Exponent do you want?");
		exp = input.nextDouble();
		System.out.println(name + ", you have entered: " + exp);
		answer = (int) Math.pow(base, exp);
		System.out.println("ans = " + answer);
	}

}
