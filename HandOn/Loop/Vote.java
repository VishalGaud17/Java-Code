package Loop;

public class Vote {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter your age : ");
		
		int x = sc.nextInt();
		
		if(x>=18) {
			
			System.out.println("You are "+x);
			System.out.println("You are Eligble to Vote");
		}
		else
		{
			System.out.println("You are "+x);
			System.out.println("You are Not Eligible to vote ");
		}
	}

}
