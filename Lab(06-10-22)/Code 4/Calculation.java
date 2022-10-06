/*	Program: Create a program for calculation read three values from the user for operation. First and second values are operands. 
 * 	Third value as operator.
 *	Name : Vishal Gaud
 *	date : 6/10/22
 */


package Lab;

public class Calculation {

	public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.print("Enter the 1st number : ");
	double a = sc.nextInt();
	System.out.print("Enter the 2nd number : ");
	double b = sc.nextInt();
	System.out.println("Enter 1 to add ");
	System.out.println("Enter 2 to divide");
	System.out.println("Enter 3 to multiply");
	System.out.println("Enter 4 to Substract");
	System.out.print("Enter : ");
		int c = sc.nextInt();
		switch(c)	{
		case(1):
			
		System.out.println(a+" + "+b+" = "+(a+b));
		break;
		
		case(2):
		System.out.println(a+" % "+b+" = "+(a/b));
		break;
		
		case(3):
		System.out.println(a+" X "+b+" = "+(a*b));
		break;	
		
		case(4):
		System.out.println(a+" - "+b+" = "+(a-b));
		break;	
		}
	}
}
