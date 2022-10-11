package Lab;

public class Switch {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter 1 For Monday");
		System.out.println("Enter 2 For Tuesday");
		System.out.println("Enter 3 For Wednesday");
		System.out.println("Enter 4 For Thrusday");
		System.out.println("Enter 5 For Friday");
		System.out.println("Enter 6 For Saturday");
		System.out.println("Enter 7 For Sunday");
		System.out.print("Enter a Number as per given instruction : ");
		int a = sc.nextInt();
		System.out.println();
		switch(a) {
		case(1):
			System.out.println("Hii today is Monday");
		break;
		
		case(2):
			System.out.println("Hii today is Tuesday");
		break;
		
		case(3):
			System.out.println("Hii today is Wednesday");
		break;
		
		case(4):
			System.out.println("Hii today is Thrusday");
		break;

		case(5):
			System.out.println("Hii today is Friday");
		break;
		
		case(6):
			System.out.println("Hii today is Saturday");
		break;
		
		case(7):
			System.out.println("Hii today is Sunday");
		break;
		
		default:
			System.out.println("Invalid Input");
			
		}System.out.println("Thank You");
	}

}
