package abstractfactory;

public class AppleBrandFactory implements BrandFactory {

	@Override
	public Phone makePhone() {
		return new ApplePhone();
	}

	@Override
	public Refrigerator makeRefrigerator() {
		return new AppleRefrigerator();
	}

	@Override
	public WashingMachine makeWashingMachine() {
		return new AppleWashingMachine();
	}

}
