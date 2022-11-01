package Operators;

public class Logical {

	public static void main(String[] args) {
		
java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter the first No. : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second No : ");
		int num2 = sc.nextInt();

		System.out.print("Enter the third No. : ");
		int num3 = sc.nextInt();
		
		System.out.println("Performing AND operations");
		//using logical AND to verify Constraint
		
		if((num1<num2)&&(num2==num3))
			
		{
			int sum = num1+num2+num3;
			System.out.println("Sum is : " + sum);
		}
			else {
			System.out.println("False Condition");
		}
		
		System.out.println("Performing OR operations");
		//using logical OR to verify String
		
		if((num1<num2)||(num2==num3))
			
		{
			int sum = num1+num2+num3;
			System.out.println("Sum is : " + sum);
		}
			else {
			System.out.println("false condition");
		}
		
		System.out.println("Performing NOT operation");
		
		System.out.println("!(x<y)" + !(num1<num2));
		
		System.out.println("!(y==z)" + !(num2==num3));


	}

}
