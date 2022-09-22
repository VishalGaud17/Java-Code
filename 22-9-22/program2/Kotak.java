package Inheritance;

	public class Kotak extends Banks {

		
		void Banklocation()			//override
		{
			System.out.println("The Bank Location is Malad");
		}
		void Bank_client_name()
		{
			super.Bank_client_name();
			System.out.println("Harshal, Shivam, Gupta, Bijlu");
		}
		

	}
