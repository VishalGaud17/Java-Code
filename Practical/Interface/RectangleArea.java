package Practical;

public class RectangleArea {
	public static void main(String[]args) {
		
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.print("Enter Length : ");
	int a = sc.nextInt();
	
	System.out.print("Enter Breadth : ");
	int b = sc.nextInt();
	
	Rectangle r=new Rectangle();
	r.getArea(a, b);
	}
}
