package Practical;

public class CarMain {

	public static void main(String[] args) {
		Car a = new Car();
		
		//Calling setter method using object of class
		a.setComp_Name("Audi");
		a.setModel_name("A7");
		
		//Calling getter method using object of class
		System.out.println("Car Name is "+a.getComp_Name());
		System.out.println("Model is "+a.getModel_name());
	
	}

}
