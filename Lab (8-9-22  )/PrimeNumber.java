class PrimeNumber
{
public static void prime(int num)
{
int i=2;
while(i<=num)
{
if (num%i==0)
{
break;
}
i++;
}
if(i==num)
{
System.out.println("Prime number");
}
else
System.out.println("Not Prime number");
}
public static void main(String[] args)
{
java.util.Scanner sc = new java.util.Scanner(System.in);
System.out.print("enter the number : ");
int num=sc.nextInt();
prime(num);
}

}