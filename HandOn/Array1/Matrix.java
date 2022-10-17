package Lab;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
				//Importing Scanner Class
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the Number of Rows : "); //Input for Rows
				int row = sc.nextInt();
				System.out.print("Enter the Number of Coloums : "); //Input for column
				int column = sc.nextInt();
				System.out.println();
				
				//Taking input for Matrix
				int array1[][]=new int[row][column];
				System.out.println("Enter Elements of the Matrix ");
				for(int i = 0;i<row;i++) {
					for(int j=0;j<column;j++) {
						array1[i][j]=sc.nextInt();
					}
				}
				System.out.println();
				//Printing Matrix
				System.out.println("Matrix : ");
				for(int i = 0;i<row;i++) {
					for(int j=0;j<column;j++) {
						System.out.print(array1[i][j]+" ");
					}System.out.println();
				}

	}

}
