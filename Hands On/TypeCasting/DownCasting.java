package Lab;

import java.util.Scanner;

public class DownCasting {

	public static void main(String[] args) {
		//Calling Scanner Class
       Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		double d = sc.nextDouble();
		//explicit type casting required
		
		long l = (long)d;
		//explicit type casting required
		
		int i = (int)l;
		System.out.println("Double is " +d);
		System.out.println("Long value " +l);
		System.out.println("Int value is " +i);
		
		
		


	}

}
