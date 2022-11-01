/* Write a program to sort ArrayList in Descending order.
 * Name : Vishal Gaud
 * Date : 01-11-22
 */

package Collections;

import java.util.*;

public class ArrayList_Descending {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		//using add method
		
		a.add("India");
		a.add("USA");
		a.add("UK");
		a.add("Japan");
		a.add("Russia");

		
		System.out.println("ArrayList : " +a);
		
		Collections.sort(a,Collections.reverseOrder());
		
		System.out.println("Sorted ArrayList : " +a);

	}

}
