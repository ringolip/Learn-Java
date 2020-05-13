package ringo.beans;

public class Car {
	private String brand;
	private String crop;
	private int price;
	private int maxSpeed;
	
	public Car(String brand, String crop, int price) {
		super();
		this.brand = brand;
		this.crop = crop;
		this.price = price;
	}
	



	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}



	@Override
	public String toString() {
		return "Car [brand=" + brand + ", crop=" + crop + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}
	
}
