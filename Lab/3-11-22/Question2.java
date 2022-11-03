/* Write a java program to check if a particular element exist in a Linked List 
 * Name : Vishal Gaud
 * Date : 03-11-22
 */

package Lab;
import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList <String> country = new LinkedList <String> ();
		country.add("India");
		country.add("USA");
		country.add("UK");
		country.add("Japan");
		country.add("France");
		country.add("UAE");
		
		
        System.out.print("Enter a Country name :");
        String check = sc.nextLine();
      		// Checks whether the Countr  exists or not.
      	if (country.contains(check.toUpperCase()))
      	{
    	  System.out.println(check.toUpperCase()+" is present in the linked list.");
      } else {
    	  System.out.println(check.toUpperCase()+" is not present in the linked list.");
      }
	}

}
