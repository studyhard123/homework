package factorymethod;

import factorymethod.AppleBrand;
import factorymethod.HuaweiBrand;
import factorymethod.MilletBrand;
import factorymethod.PhoneFactory;

public class TestFactoryMethod {

	public static void main(String[] args) {
		PhoneFactory factory1 = new AppleBrand();
		factory1.manufacturing();
		PhoneFactory factory2 = new HuaweiBrand();
		factory2.manufacturing();
		PhoneFactory factory3 = new MilletBrand();
		factory3.manufacturing();
	}
}
