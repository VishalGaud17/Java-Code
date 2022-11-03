/* write a java program to compare two sets and retain elements which are same on both sets.(Using retainAll method)
 * Name : Vishal Gaud
 * Date : 03-11-22
 */

package Lab;

import java.util.HashSet;

public class Question3 {

	public static void main(String[] args) {
		HashSet<String> country1 = new HashSet<String>();
	     // use add() method to add values in the hash set
		country1.add("India");
		country1.add("USA");
		country1.add("UK");
		country1.add("Japan");
	    System.out.println("Frist Fruit Set content: "+country1);
	          
	          HashSet<String>country2 = new HashSet<String>();
	          country2.add("India");
	  		  country2.add("France");
	  		  country2.add("UAE");
	  		  country2.add("Japan");
	  		  
	          System.out.println("Second Fruit Set content: "+country2);
	          country1.retainAll(country2);
	          System.out.print("Common Elements : ");
	          System.out.println(country1);

	}

}
