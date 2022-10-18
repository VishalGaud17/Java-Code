package Lab;

import java.util.Scanner;

public class SubtractionOfTwoMatrices {

	public static void main(String[] args) {
		//Creating object of Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : "); //Input for Rows
		int row = sc.nextInt();
		System.out.print("Enter the Number of Coloums : "); //Input for column
		int column = sc.nextInt();
		System.out.println();
		
		//Taking input for First Matrix
		int array1[][]=new int[row][column];
		System.out.println("Enter Elements of First Matrix");
		for(int i = 0;i<row;i++) {
			for(int j=0;j<column;j++) {
				array1[i][j]=sc.nextInt();
			}
		}
		//Printing First Matrix
		System.out.println("First Matrix is : ");
		for(int i = 0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(array1[i][j]+" ");
			}System.out.println();
		}
		System.out.println();
		
		//Taking input for Second Matrix
		int array2[][]=new int[row][column];
		System.out.println("Enter Elements of Second Matrix");
		for(int i = 0;i<row;i++) {
			for(int j=0;j<column;j++) {
				array2[i][j]=sc.nextInt();
			}
		}
		//Printing Second Matrix
		System.out.println("Second Matrix is : ");
		for(int i = 0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(array2[i][j]+" ");
			}System.out.println();
		}
		System.out.println();
		
		//Subtracting and Printing subtraction of 2 Matrices 
		int array3[][]=new int[row][column];  
		System.out.println("subtraction of Two Matrix ");
		for(int i=0;i<row;i++){    
		for(int j=0;j<column;j++){    
		array3[i][j]=array1[i][j]-array2[i][j];  
		System.out.print(array3[i][j]+" ");    
		}    
		System.out.println(); 
		}    
	}
}
