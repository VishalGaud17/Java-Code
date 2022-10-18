package Lab;

import java.util.Scanner;

public class Matrices {

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
				System.out.println("Enter 1 for Mul");
				System.out.println("Enter 2 for sub");
				System.out.println("Enter 3 for add");
				System.out.println("Enter 4 for div");
				int z =sc.nextInt();
				System.out.println();
				
				int array3[][]=new int[row][column];  
				//multiplying and Printing Multiplication of 2 Matrices 
					if(z==1) {System.out.println("Multiplication of Two Matrix ");
						for(int i=0;i<row;i++){    
							for(int j=0;j<column;j++){ 
								array3[i][j]=array1[i][j]*array2[i][j];  
								System.out.print(array3[i][j]+" ");    
							}    
							System.out.println(); 
							}    
					}
					//subtracting and Printing subtraction of 2 Matrices 
					else if(z==2) {System.out.println("subtraction of Two Matrix ");
						for(int i=0;i<row;i++){    
							for(int j=0;j<column;j++){ 
								array3[i][j]=array1[i][j]*array2[i][j];  
								System.out.print(array3[i][j]+" ");    
							}    
							System.out.println(); 
							}    
					}
					//Adding and Printing Addition of 2 Matrices 
					else if(z==3) {System.out.println("Addition of Two Matrix ");
						for(int i=0;i<row;i++){    
							for(int j=0;j<column;j++){ 
								array3[i][j]=array1[i][j]*array2[i][j];  
								System.out.print(array3[i][j]+" ");    
							}    
							System.out.println(); 
							}    
					}
					//Dividing and Printing Division of 2 Matrices 
					else if(z==4) {System.out.println("Division of Two Matrix ");
						for(int i=0;i<row;i++){    
							for(int j=0;j<column;j++){ 
								array3[i][j]=array1[i][j]*array2[i][j];  
								System.out.print(array3[i][j]+" ");    
							}    
							System.out.println(); 
							}    
					}else {
						System.out.println("Invalid Input");
					}
				
				

	}

}
