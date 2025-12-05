package ClassandMethodExer;

public class Car {
	String brand;
	String model;
	int year;
	String color;
	
	Car(){
		this.brand="Unknown";
		this.model="Unknown";
		this.year=0;
		this.color="Unknown";
	}
	
	//Parameterized constructor
	Car(String brand, String model, int year,String color) {
		this.brand=brand;
		this.model=model;
		this.year=year;
		this.color=color;
		
	}
	
	//setter methods
	public void setBrand(String brand) {this.brand = brand; }
	public void setModel(String model) {this.model = model; }
	public void setYear(int year) {this.year = year; }
	public void setColor(String color) {this.color = color; }
	
	//method
	void displayInfo() {
		System.out.println("Car Details:");
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Color: " + color);
		System.out.println();
	}	

}
