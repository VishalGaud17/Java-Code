package lab_Session;

public class NaturalNumbers {

	public static void main(String[] args) {
		
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int sum=0;
		int a ;
		int b=1;
		while(b <= 10) 	{
			
			System.out.print("Enter "+b+" Natural Numbers : ");
			a = sc.nextInt();
			if (a<=0) {
				System.out.println();
				System.out.println("Enter a Natural Number Only");
				
			}else {
			sum=sum+a;
			b++;
		}}
		System.out.println();
		System.out.println("Sum of the 10 Natural Numbers is "+sum);
		

	}

}
