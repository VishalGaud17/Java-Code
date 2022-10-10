package Operators;

public class Assignment {

	public static void main(String[] args) {

java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter Second Number : ");
		int num2 = sc.nextInt();
		
		//adding and assigning values
		num1 += num2;
		System.out.println("num1 = : " + num1);
		
		num1 -= num2;
		System.out.println("num1 = : " + num1);
		
		num1 *= num2;
		System.out.println("num1 = : " + num1);
		
		num1 /= num2;
		System.out.println("num1 = : " + num1);
		
		num1 %= num2;
		System.out.println("num1 = : " + num1);

	}

}
