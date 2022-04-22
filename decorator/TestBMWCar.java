package patterns.decorator0;

public class TestBMWCar {

	public static void main(String[] args) {
		Car bmw = new BMW();
		
		System.out.println(bmw.description + " $" + bmw.cost());
		System.out.println(bmw.hasDesignPackage() ? "design package added" : "");
		System.out.println(bmw.hasExterior() ? "exterior package added" : "");
		System.out.println(bmw.hasNavigationPlus() ? "navigationPlus package added" : "");
		
		bmw.setDesignPackage(true);
		bmw.setExterior(true);
		bmw.setNavigationPlus(true);
		
		System.out.println(bmw.description + " $" + bmw.cost());
		System.out.println(bmw.hasDesignPackage() ? "design package added" : "");
		System.out.println(bmw.hasExterior() ? "exterior package added" : "");
		System.out.println(bmw.hasNavigationPlus() ? "navigationPlus package added" : "");
	}

}
