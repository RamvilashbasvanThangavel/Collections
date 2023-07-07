package collectionsBasiscStream;

public class Watch {
	private String brand;
	private int price;
	private String colour;
	private float rating;
	private String type;
	private boolean isWarranty;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isWarranty() {
		return isWarranty;
	}

	public void setWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}

	public Watch(String brand, int price, String colour, float rating, String type, boolean isWarranty) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.rating = rating;
		this.type = type;
		this.isWarranty = isWarranty;
	}

	@Override
	public String toString() {
		return "Watch [brand=" + brand + ", price=" + price + ", colour=" + colour + ", rating=" + rating + ", type="
				+ type + ", isWarranty=" + isWarranty + "]";
	}

}
