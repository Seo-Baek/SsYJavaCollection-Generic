package Generic;

public class Generic3DPrinter_main {

	public static void main(String[] args) {
		
		Generic3DPrinter<Powder> powderPrinter = 
				new Generic3DPrinter<>();
		
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter);
		System.out.println();
		
		Generic3DPrinter<Plastic> plasticPrinter =
				new Generic3DPrinter<Plastic>();
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter);
		
	}

}
