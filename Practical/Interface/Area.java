package Practical;

//Abstract Method of Interface
interface Area {
	void getArea(int length,int breadth);
}
//Implement the Area Interface
class Rectangle implements Area{
	
	//Implementation of abstract Method
	public void getArea(int length, int breadth) {
		System.out.println("The area of the Rectangle is "+(length * breadth));
		
	}
	
}
