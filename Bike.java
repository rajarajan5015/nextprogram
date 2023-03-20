package Collection1;
import java.util.ArrayList;
public class Bike {
	private String brand;
	private int model;
	private int price;
	private String colour;
	private boolean isPetrol;
	private String regNum;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
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
	public boolean isPetrol() {
		return isPetrol;
	}
	public void setPetrol(boolean isPetrol) {
		this.isPetrol = isPetrol;
	}
	public String getRegNum() {
		return regNum;
	}
	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	public Bike(String brand, int model, int price, String colour, boolean isPetrol, String regNum) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.colour = colour;
		this.isPetrol = isPetrol;
		this.regNum = regNum;
	}
	public String toString() {
		return "Bike [brand=" + brand + ", model=" + model + ", price=" + price + ", colour=" + colour + ", isPetrol="
				+ isPetrol + ", regNum=" + regNum + "]";
	}
	
	

}
