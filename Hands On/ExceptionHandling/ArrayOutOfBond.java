/*Write a Program on ArrayIndexOutOfBoundsException
 */
package Exceptions;

import java.util.*;

public class ArrayOutOfBond {
  
	 public static void main(String[] args) { 
		 int array[]= {5,4,2,6,3,1};
		 Scanner sc = new Scanner(System.in);//Taking input
		 System.out.print("Enter index of the array : ");
		 int a =sc.nextInt();
		 try{     
             System.out.println("Number at "+a+" index is "+array[a]);
            }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBoundsException arraylength is 5"); 
               }     
		  System.out.println("rest of the code");

	}
}
;