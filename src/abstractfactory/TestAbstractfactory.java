package abstractfactory;

import abstractfactory.AppleBrandFactory;
import abstractfactory.BrandFactory;
import abstractfactory.MilletBrandFactory;

public class TestAbstractfactory {

	public static void main(String[] args) {
		BrandFactory factory1 = new AppleBrandFactory();
		factory1.makePhone().phoneName();
		factory1.makeRefrigerator().refrigeratorName();
		factory1.makeWashingMachine().washingMachineName();
		System.out.println("-----------------------------------");
		BrandFactory factory2 = new MilletBrandFactory();
		factory2.makePhone().phoneName();
		factory2.makeRefrigerator().refrigeratorName();
		factory2.makeWashingMachine().washingMachineName();
	}
}
