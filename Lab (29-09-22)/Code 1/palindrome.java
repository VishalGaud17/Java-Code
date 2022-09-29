package Lab;

public class palindrome {
	public static void main(String[] args) {
		String a1="";	
		char a ;
		String a2 = null;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("write a name : ");		
		String Name = sc.nextLine();		
		char [] x = Name.toCharArray();
			for(int i=x.length-1;i>=0;i--) 
			{
				a = x[i];
				a2= Character.toString(a);
				a1 = a1+a2;
			}
			System.out.println(a1);
			if(Name.equalsIgnoreCase(a1)) {
				System.out.print("It is Pelindrome"); 
			}
			else {
				System.out.print("Not Pelindrome");
			}
	}


}
