package factorymethod;

public class HuaweiBrand implements PhoneFactory {
	
	@Override
	public void manufacturing(){
		System.out.println("工厂制造了——华为手机");
	}
}
