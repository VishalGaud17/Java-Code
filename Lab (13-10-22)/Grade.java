package lab_Session;

public class Grade {

	public static void main(String[] args) {
		
		System.out.print("Enter your Percentage : ");
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.println();		
		if(a>=90 && a<=100)	{		
			System.out.println("You got Grade A ");		
		}
		else if(a>=80 && a<90)	{		
			System.out.println("You got Grade A1 ");		
		}
		else if(a>=70 && a<80)	{
			System.out.println("You got Grade B ");	
		}
		else if(a>=60 && a<70)	{
			System.out.println("You got Grade B1 ");
		}
		else if(a>=40 && a<60)	{
			System.out.println("You got Grade C ");
		}
		else if(a>35 && a<40)	{
			System.out.println("You got Grade C1 ");
		}
		else if(a>=0 && a<35)	{	
			System.out.println("Sorry You are Fail ");
		}else {
			System.out.println("Invalid Input");
		}
		

	}

}
