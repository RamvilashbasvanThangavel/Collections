package collectionsBasiscStream;

public class Car {
	private String noPlate;
	private String brand;
	private int price;
	private String colour;
	private float rating;
	private String model;
	public Car(String noPlate, String brand, int price, String colour, float rating, String model) {
		super();
		this.noPlate = noPlate;
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.rating = rating;
		this.model = model;
	}
	public String getNoPlate() {
		return noPlate;
	}
	public void setNoPlate(String noPlate) {
		this.noPlate = noPlate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [noPlate=" + noPlate + ", brand=" + brand + ", price=" + price + ", colour=" + colour + ", rating="
				+ rating + ", model=" + model + "]";
	}
	
	
	

	
}
