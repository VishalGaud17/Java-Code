/*
* demonstrate if-else statement of 5
* subjects.the person who gets above 60% will be
* passed otherwise failed.output should be
* like:Enter your name,Enter marks for the 5 subjects.
* Name : Vishal Gaud
* Date : 11/10/22
*/

package Loop;

public class Result {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = sc.next();
		
		System.out.println("Enter your English Marks: ");
		int a=sc.nextInt();
		System.out.println("Enter your Hindi Marks: ");
		int b=sc.nextInt();
		System.out.println("Enter your Mathematics Marks: ");
		int c=sc.nextInt();
		System.out.println("Enter your science Marks: ");
		int d=sc.nextInt();
		System.out.println("Enter your PT Marks: ");
		int e=sc.nextInt();
		
			int per = ((a+b+c+d+e)/5);
			
			System.out.println();
			System.out.println(name+" You got "+per+"%");
			if(per>=60)	{
				
				System.out.println("Your are Pass ");
			}
			else	{
				System.out.println("You are Fail ");
			}

	}

}
