package lab_Session;

public class PositiveNumbers {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int a = 0;
	    int sum = 0;
	    do {
	    System.out.print("Enter a Natural Number : ");
		a = sc.nextInt();
	   
	    if(a>0) {
	    	 sum = sum+ a;  
	    }else {
	    	System.out.println();
	    	System.out.println("You Entered a NonNatural Number");
	    	System.out.println();
	    }
	    } while(a > 0);    
	    System.out.println("Sum of the Positive Numbers is " + sum);
	}

}
