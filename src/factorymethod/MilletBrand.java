package factorymethod;

public class MilletBrand implements PhoneFactory {
	
	@Override
	public void manufacturing(){
		System.out.println("工厂制造了——小米手机");
	}
}
