package Lab;

import java.util.Scanner;

public class UpCasting {

	public static void main(String[] args) {
		        //Calling Scanner Class 
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter a number : ");
				int i = sc.nextInt();
				//no explicit type casting required
				long l = i;
				//no explicit type casting required
				float f = l;

				//Printing Values
				System.out.println("Int value is " +i);
				System.out.println("Long value is " +l);
				System.out.println("Float is " +f);
	}

}
