package Array;

import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Elements : ");
		int a=sc.nextInt();
		String b[]= new String[a];
		ArrayList<String> cars = new ArrayList<String>();
		for(int i=0;i<a;i++) {
			System.out.print("Enter "+(i+1)+" Element : ");
			b[i]=sc.next();
		}
		System.out.println();
		for(int i=0;i<a;i++) {
			cars.add(b[i]);
		}
		System.out.println(cars);
	}

}
