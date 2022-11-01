package Lab;

import java.util.Scanner;

public class Matrixof4 {

	public static void main(String[] args) {
				//Importing Scanner Class
				Scanner sc = new Scanner(System.in);
				
				//Taking input for Matrix
				int array1[][]=new int[4][4];
				System.out.println("Enter Elements of the 4X4 Matrix ");
				for(int i = 0;i<4;i++) {
					for(int j=0;j<4;j++) {
						array1[i][j]=sc.nextInt();
					}
				}
				System.out.println();
				//Printing Matrix
				System.out.println("The 4X4 Matrix : ");
	
				for(int i = 0;i<4;i++) {
					for(int j=0;j<4;j++) {
						System.out.print(array1[i][j]+" ");
						}
					System.out.println();
				}
	}
}


