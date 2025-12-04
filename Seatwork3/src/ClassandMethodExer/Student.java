/**
 * 
 */
package ClassandMethodExer;

/**
 * 
 */
public class Student {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.brand="Honda";
		car1.model="jazz";
		car1.year=2019;
		car1.color="Ralye Red";
		
		Car car2 = new Car("Toyota","Fortuner",2024,"White");
		
		car1.displayInfo();
		car2.displayInfo();		
	}

}
