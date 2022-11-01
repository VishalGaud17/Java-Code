/*	Program: Create a program to find largest number of two numbers
 * Name : Vishal Gaud
 * Date : 06-10-22
 */
package Lab;

public class LargerNumber {

	public static void main(String[] args) {
java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter the 1st number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter the 2nd number : ");
		int b = sc.nextInt();
		
		if(a>b)	{
			System.out.println(a+" is greater than "+b);
		}

		else if(b>a){	
			System.out.println(b+" is greater than "+a);
		}
		
		else {
			System.out.println("Both numbers are Equal");
		}
	}
}
