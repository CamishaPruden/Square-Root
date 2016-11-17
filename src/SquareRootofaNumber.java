import java.util.Scanner;

/**
 * 
 */

/**
 * @author c.pruden
 *
 */
public class SquareRootofaNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		double userNumber;
		
		do{
			System.out.println("Please enter a number:");
			userNumber = Input.nextDouble();
			
			if(userNumber<0){
				System.out.println("Please enter a positive number:");
			}
		}while(userNumber<0);
		
		System.out.println("Your sqaure root is " + Math.sqrt(userNumber));
		
		Input.close();
	}

}
