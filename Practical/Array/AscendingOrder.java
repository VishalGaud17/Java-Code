package Array;

import java.util.*;

public class AscendingOrder {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the number of element in array : ");
			int a = sc.nextInt();
			String array[] = new String[a];		
			for(int i=0;i<a;i++)	
			{
				System.out.print("Enter "+(i+1)+" Elements ");
				array[i] = sc.next();
			}
			//Print original array
			System.out.println("Original array " +Arrays.toString(array));
			//sort the array in Ascending order
			Arrays.sort(array);
			System.out.println("Ascending " + Arrays.toString(array));
			

	}

}
