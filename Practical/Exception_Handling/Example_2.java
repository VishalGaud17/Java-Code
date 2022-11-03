package Exception_Handling;

class Example_2 {
	
	public static void dividebyzero()
	{
		//throw an exception
		throw new ArithmeticException("Trying to divide by 0");
	}
		public static void main(String[] args)
		{
			dividebyzero();
	}

}
