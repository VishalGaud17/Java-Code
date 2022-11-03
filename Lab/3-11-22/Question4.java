/* Write a java program to get the element in a tree set which is strictly greater than or equal to the given element
 * Name : Vishal Gaud
 * Date : 03-11-22
 */

package Lab;
import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		// Creating an object of TreeSets class
		TreeSet<Integer> obj = new TreeSet<>();	      
		   obj.add(12);
		   obj.add(24);
		   obj.add(29);
		   obj.add(69);
		   obj.add(45);
		   obj.add(44);
		   obj.add(63);
		   obj.add(22);
		   obj.add(70);
		   System.out.println("Original TreeSet : "+obj);
		   System.out.print("Enter a number : ");
		   int a = sc.nextInt();
		   sc.close();
		   if(a<=70) {
			   System.out.print("Value of TreeSet: " + obj.ceiling(a));
		   }
		   else
		   {
			   System.out.println("There is no number greater than: " + a);
		   }

	}

}
