package Array;

import java.util.*;

public class Even {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of element in array : ");
		int a = sc.nextInt();
		int array[] = new int[a];	
		for(int i=0;i<a;i++)	
		{
			System.out.print("Enter "+(i+1)+" Elements ");
			int n=sc.nextInt();
			if(n%2==0 && n>0) {
			array[i] = n;
			}else {
				array[i]=1;
			}
		}
			Arrays.sort(array);
			System.out.println();
			System.out.print("{ ");
		for(int i=0;i<a;i++)	
		{
			if(array[i]%2==0) {	
				if(i==(array.length-1)){
					System.out.print(array[i]+" ");
					}else {
					System.out.print(array[i]+", ");
					}
				}
			}
		System.out.print("}");
	}
}