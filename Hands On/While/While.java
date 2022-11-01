/*	to demonstrate while loop continues until entered number is positive and take input from user.
 * 	name : Vishal Gaud
 * 	Date 12/10/22
 */

public class While {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//using while loop
		while(true)
		{
			//Taking input from users
			System.out.print("Enter a number : ");
			int num = sc.nextInt();
	
			//using if condition
			if(num<0) {
				System.out.println("The Code is Over");
				System.out.println("Thank You");
				break;
			}
		}
}}