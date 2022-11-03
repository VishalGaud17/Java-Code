/* Write a java program to change PriorityQueue to maximum Priorityqueue Using Any loop
 * Name : Vishal Gaud
 * Date : 03-11-22
 */

package Lab;

import java.util.Collections;
import java.util.PriorityQueue;

public class Question5 {

	public static void main(String[] args) {
		
		// Creating an object of PriorityQueue class
				PriorityQueue<Integer> obj = new PriorityQueue<>(Collections.reverseOrder());
				   // Add numbers in the Queue
				   obj.add(12);
				   obj.add(24);
				   obj.add(29);
				   obj.add(69);
				   obj.add(45);
				   obj.add(44);
				   obj.add(63);
				   obj.add(22);
				   obj.add(70);
				
					//Printing Original priority queue
				   System.out.println("Original Priority Queue: "+obj);
				   
				   //Printing Maximum priority Queue
				System.out.print("Maximum Priority Queue: ");
				Integer val = 10;
				//using while loop
				while( ( val = obj.poll()) != null) {
				    System.out.print(val+"  ");
				      }
	}

}
