package Array;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		int i, j=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of element in array : ");
		int a = sc.nextInt();
		int array[] = new int[a];
		int rev[] = new int[a];
		
		
		
		for(i=0;i<a;i++)	
		{
			System.out.print("Enter "+(i+1)+" elements ");
			array[i] = sc.nextInt();
		}
			
		System.out.print("Reverse of array is ");
		System.out.print("{ ");
		for(i=a;i>0;i--,j++)	
		{
			rev[j] = array[i-1];
			
				
					System.out.print(rev[j]+" ");	
					
				}System.out.print("}");
	}

}
