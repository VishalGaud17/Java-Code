/*Program: Create another class inheritance and object of class and call all 
 * the methods.also mention the type of inheritance on the tob of
 *  Name : Vishal Gaud
 * Date : 06-10-22
*/
package Lab;

public class Parent_Child extends Child{

	public static void main(String[] args)
	{
		Parent_Child p1=new Parent_Child();
		p1.Sing();	
		p1.Speak();		
		p1.Dance();		
	}

}
