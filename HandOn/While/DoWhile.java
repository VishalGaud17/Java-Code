/* Program to demonstrate do while and print  the reverse counting from the user input number
 * name : Vishal Gaud
 * date 12/10/22
 */

public class DoWhile {

	public static void main(String[] args) {
		
		//Using Scanner
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//Taking input from user
		System.out.print("Enter number of count : ");
		int count = sc.nextInt();
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println();
		//do while loop
		do
		{
				System.out.print(num+"  ");
				num--;
				count--;		
		}
		
		while(count>=1);

	}

}
