package abstractfactory;

public class MilletBrandFactory implements BrandFactory {

	@Override
	public Phone makePhone() {
		return new MilletPhone();
	}

	@Override
	public Refrigerator makeRefrigerator() {
		return new MilletRefrigerator();
	}

	@Override
	public WashingMachine makeWashingMachine() {
		return new MilletWashingMachine();
	}

}
