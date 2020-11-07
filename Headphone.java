package ArrayList;

public class Headphone {
	private String brand;
	private double price;	
	private boolean isMic;
	public Headphone(String brand, double price, boolean isMic) {
		super();
		this.brand = brand;
		this.price = price;
		this.isMic = isMic;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isMic() {
		return isMic;
	}
	public void setMic(boolean isMic) {
		this.isMic = isMic;
	}
	@Override
	public String toString() {
		return "Headphone [brand=" + brand + ", price=" + price + ", isMic=" + isMic + "]";
	}


}
