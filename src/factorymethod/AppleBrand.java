package factorymethod;

public class AppleBrand implements PhoneFactory {

	@Override
	public void manufacturing() {
		System.out.println("工厂制造了——苹果手机");
	}
	
}
