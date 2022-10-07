package Practical;

interface Area {
	void getArea(int length,int breadth);
}

class Rectangle implements Area{

	@Override
	public void getArea(int length, int breadth) {
		System.out.println("The area of the Rectangle is "+(length * breadth));
		
	}
	
}