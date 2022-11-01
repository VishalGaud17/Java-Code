/* Write a program to iterate ArrayList.
 * Name : Vishal Gaud
 * Date : 1-11-22
 */

package Collections;

import java.util.*;

public class Iterator_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		//using add method
		
		a.add("India");
		a.add("USA");
		a.add("UK");
		a.add("Japan");
		a.add("Russia");
		
		System.out.println("ArrayList : " +a);
		System.out.println();
		//calling iterator() method
		Iterator<String> b = a.iterator();
		System.out.println("ArrayList using Iterator");
				while(b.hasNext())
		{
			
			System.out.print(b.next()+"  ");
	
		}
	}

}
