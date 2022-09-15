class constructor{
	int id;
	String name;
	static String department="IT";
	String company;
	constructor(int x, String y){
	id=x;
	name=y;
	}
	void display()
	{
	System.out.println(id+" "+name+" "+department+" "+company);
	}
public static void main(String []args){

constructor a1=new constructor(001,"Vishal");
constructor a2=new constructor(002,"Shivam");
constructor a3=new constructor(003,"Aditya");
a1.company="TCS";
a2.company="Google";
a3.company="Microsoft";

a1.display();
a2.display();
a3.display();
}
}