package Inheritance;

	public class Kotak extends Bank {

		
		void Banklocation()			//override
		{
			System.out.println("The Bank Location is Delhi");
		}
		void Bank_client_name()
		{
			super.Bank_client_name();
			System.out.println("Aditya, Vishal, Shivam, Bala");
		}
		

	}