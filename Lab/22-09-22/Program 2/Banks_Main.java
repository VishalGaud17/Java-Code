package Inheritance;

public class Banks_Main {
		
		public static void main(String[] args)
		{
			Bank b1 = new Bank();
			
			b1.Banklocation();
			b1.Bank_client_name();
			
			Kotak k1= new Kotak();
			
			k1.Banklocation();
			k1.Bank_client_name();
			
			SBI_Bank s1= new SBI_Bank();
			
			s1.Banklocation();
			s1.Bank_client_name();
		}

}