/**
 * 
 */
package CallMethodexer;

class WhiteBoard {
	int addNumbers(int addend1,int addend2) {
		int sum = addend1 + addend2;
		return sum;
		
	}
}
/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhiteBoard wb= new  WhiteBoard();
		int result = wb.addNumbers(5,3);
		System.out.println("The total is: " + String.valueOf(result));

	}

}
