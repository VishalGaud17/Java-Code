package Operators;

public class Bitwise {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter the first No. : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second No : ");
		int num2 = sc.nextInt();
		
		//Bitwise AND Operator
		System.out.println("num1 & num2 : " +(num1 & num2));
				//0101 
				//0110 ------ 0100 = 4
		
		//Bitwise OR Operator
		System.out.println("num1 | num2 : " +(num1 | num2));
				//0101 
				//0110 ------ 0111 = 7
		
		//Bitwise XOR Operator
		System.out.println("num1 ^ num2 : " +(num1 ^ num2));
				//0101 
				//0110 ------ 0011 = 3

	}

}
