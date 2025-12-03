/**
 * 
 */
package JavaAge;

/**
 * 
 */
import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		
		int age =scanner.nextInt();
		double agedouble = (double)age;
		System.out.println("Your age as int: " + age);
		System.out.print("Your age as double: " + agedouble);

	}

}
