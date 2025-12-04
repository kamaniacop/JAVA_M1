/**
 * 
 */
package AgeBasisAct;

/**
 * 
 */

import java.util.Scanner;
public class AgeBasisActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner agescan = new Scanner(System.in);
		
		System.out.print("Enter your age:  ");
		int age = agescan.nextInt();
		
		if (age <= 18) {
			System.out.println("Minor");
		}
		else if (age >= 19 && age <= 59 )
			System.out.println("Adult");
		else if (age >= 60)
		{
			System.out.println("Senior");
		}
		agescan.close();
	}

}
