package simpelfactory;

public abstract class Phone {

	//����
	private String name;
	
	//�ߴ�
	private Double size;
	
	//�ͺ�
	private String Model;
	
	//�۸�
	private Double price;
	
	//Ʒ��
	private String brand;

	public Phone() {
		super();
	}

	public Phone(String name, Double size, String model, Double price, String brand) {
		super();
		this.name = name;
		this.size = size;
		Model = model;
		this.price = price;
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public abstract void getPhoneName();
}
