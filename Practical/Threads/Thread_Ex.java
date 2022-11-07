package Threads;

 class Thread_Ex extends Thread
 { 	
	public static int amount=0;
	public static void main(String[] args) 
	{
	Thread_Ex te=new Thread_Ex();
	te.start();
	System.out.println(amount); 
	amount++;   
	System.out.println(amount);
	}
	public void run()
	{
	amount++; 
	}
}