package Operators;

public class Arithmetic {

	public static void main(String[] args) {
		
		// creating scanner class object to take the input from the user
				java.util.Scanner sc = new java.util.Scanner(System.in);
				
				System.out.print("Enter First Nunber : ");
				double x = sc.nextInt();
				
				System.out.print("Enter second Number : ");
				double y = sc.nextInt();
				
				System.out.println();
				//Writing operation
			
				double add, sub, mod, mul, div;
				add = x + y;
				sub = x - y;
				div = x / y;
				mul = x * y;
				mod = x % y;
				
				//printing values 
				System.out.println("Addition is : " + add);
				System.out.println("Subtraction is : " + sub);
				System.out.println("division is : " + div);
				System.out.println("multiplication is : " + mul);
				System.out.println("modules is : " + mod);
			
			}
	}
