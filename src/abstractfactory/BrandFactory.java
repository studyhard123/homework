package abstractfactory;

public interface BrandFactory {

	Phone makePhone();
	
	Refrigerator makeRefrigerator();
	
	WashingMachine makeWashingMachine();
}
