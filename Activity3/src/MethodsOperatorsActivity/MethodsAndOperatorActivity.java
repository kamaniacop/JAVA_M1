/**
 * 
 */
package MethodsOperatorsActivity;

/**
 * 
 */
import java.util.Scanner;
public class MethodsAndOperatorActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second integer: ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int diff = num1 - num2;
		int prod = num1 * num2;
		
		System.out.println("Sum:" + sum);
		System.out.println("Difference:" + diff);
		System.out.println("Product:" + prod);
		
		
	}

}
