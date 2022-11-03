/* Write a java program to replace the second element of a ArrayList with the specified element 
 * Name : Vishal Gaud
 * Date : 03-11-22
 */

package Lab;

import java.util.ArrayList;

public class Question1 {

	public static void main(String[] args) {
		ArrayList<String>  country = new ArrayList<String>();

		country.add("India");
		country.add("USA");
		country.add("UK");
		country.add("Japan");

		  System.out.println("Original array list: " + country);
		  String obj1 = "France";
		  country.set(1,obj1);
		  System.out.println("New array list: " + country);	  

	}

}
