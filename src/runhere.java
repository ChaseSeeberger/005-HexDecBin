
public class runhere {

	public static void main(String[] args) {
		
		String base = "";
		String baseHex = "hex";
		
		HexDecBin baseConverter = new HexDecBin();
		base = baseConverter.HexDecBinBase();
		System.out.println(base);
		System.out.println(baseHex);
		if(base == "hex") {
			System.out.println("in");
			baseConverter.getHexNumber();
		} else {
			System.out.println("skip");
		}
	}
}
/*BinPower binpower = new BinPower();
binpower.setBinary(); */
//baseConverter.convert();