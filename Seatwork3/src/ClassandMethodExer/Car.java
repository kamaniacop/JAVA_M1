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
	
	Car(String brand, String model, int year,String color) {
		this.brand=brand;
		this.model=model;
		this.year=year;
		this.color=color;
		
	}
	
	void displayInfo() {
		System.out.println("Car Details:");
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Color: " + color);
		System.out.println();
	}	

}
