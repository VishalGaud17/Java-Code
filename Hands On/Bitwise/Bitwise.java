package Lab;

class Bitwise {

	public static void main(String[] args) {

			java.util.Scanner sc = new java.util.Scanner(System.in);
				
			System.out.print("Enter First Number : ");
			int num1 = sc.nextInt();
				
			System.out.print("Enter Second Number : ");
			int num2 = sc.nextInt();
			System.out.println();
				
			//Bitwise AND Operator
			System.out.println("num1 & num2 : " +(num1 & num2));
						
			//Bitwise OR Operator
			System.out.println("num1 | num2 : " +(num1 | num2));
						
			//Bitwise XOR Operator
			System.out.println("num1 ^ num2 : " +(num1 ^ num2));
				
		}

}
