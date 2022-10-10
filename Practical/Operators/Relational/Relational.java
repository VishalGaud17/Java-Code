package Operators;

public class Relational {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		
			System.out.print("Enter the first No. : ");
			int num1 = sc.nextInt();
		
			System.out.print("Enter second No : ");
			int num2 = sc.nextInt();

			//Performing equal to operation
			System.out.println("num1==num2 : " +(num1==num2));
		
			//Performing is not equal to operation
			System.out.println("num1!=num2 : " +(num1!=num2));
		
		   	//Performing greater then operation
			System.out.println("num1>num2 : " +(num1>num2));
			
			//Performing less than operation
			System.out.println("num1<num2 : " +(num1<num2));
				
				
			//Performing Greater than equal to operation
			System.out.println("num1>=num2 : " +(num1>=num2));
			
			//Performing less than equal to operation
			System.out.println("num1<=num2 : " +(num1<=num2));
				

	}

}
