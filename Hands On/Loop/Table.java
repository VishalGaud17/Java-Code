/*
* Print any multiplication table using for loop.
* take the input from the user in all the program.
* Name : Vishal Gaud
* Date : 11/10/22
*/

package Loop;

public class Table {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter the number : ");
		
			int x = sc.nextInt();
			
		for(int i=1;i<=10;i++)	{
			
			System.out.println(x+" X "+ i +" = "+x*i);

	}
	}
}

