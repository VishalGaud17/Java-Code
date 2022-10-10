package Operators;

public class Unary {
	
		public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter the first No. : ");
		int num1 = sc.nextInt();
		
		// performing pre-increment operation
		++num1;
		System.out.println("pre-increment value is : " +num1);
		
		// performing post-increment operation
		num1++;
		System.out.println("post-increment value is : " +num1);

		// performing pre-decrement operation
		--num1;
		System.out.println("pre-decrement value is : " +num1);

		// performing post-decrement operation
		num1--;
		System.out.println("post-decrement value is : " +num1);

	}
}
