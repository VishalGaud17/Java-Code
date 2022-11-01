package Lab;

public class Phone_Main {

	public static void main(String[] args) {
		Phone p1 = new Phone("Samsung","Galaxy S22",16,"Green");
		Phone p2 = new Phone("OnePlus","Nord 2T",8,"Blue");
		Phone p3 = new Phone("Apple","14",6,"Red");
		
		Phone[] a = new Phone[3];
		a[0] = p1;
		a[1] = p2;
		a[2] = p3;

		for(Phone p : a)
		{
			System.out.println("Company's Name : " + p.Company_Name);
			System.out.println("Model Name : " + p.Model_Name);
			System.out.println("Ram : " + p.Ram+"  "+"Color : " + p.Color);
			System.out.println();
		}
	}

}
