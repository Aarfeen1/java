package ArrayList;

public class Laptop {
String brand;
double price;
boolean isI5;
public Laptop(String brand, double price, boolean isI5) {
	super();
	this.brand = brand;
	this.price = price;
	this.isI5 = isI5;
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
public boolean isI5() {
	return isI5;
}
public void setI5(boolean isI5) {
	this.isI5 = isI5;
}
@Override
public String toString() {
	return "Laptop [brand=" + brand + ", price=" + price + ", isI5=" + isI5 + "]";
}

}
