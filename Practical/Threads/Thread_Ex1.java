package Threads;
/*
 * To avoid concurrency problems  isAlive() method is used.
 * This method will check whether the thread has finished  running
 * before using any attributes that the thread can change.
 */
 class Thread_Ex1 extends Thread
 { 	
	public static int amount=0;
	public static void main(String[] args) 
	{
	Thread_Ex1 te=new Thread_Ex1();
	te.start();
	//wait for the thread to finish.
	while(te.isAlive())
	{
		System.out.println("Waiting......");
	}
	//update amount and print its value.
	System.out.println("Value:"+amount);  
	amount++;
	System.out.println("Value:"+amount);
	}
	public void run()
	{
	amount++; 
	}
}