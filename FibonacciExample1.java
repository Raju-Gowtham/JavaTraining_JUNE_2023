//java program to generate fabonacci series upto n value
import java.util.Scanner;
class FibonacciExample
{
  public static void main(String abc[])
  {
    Scanner sc=new Scanner(System.in);
	int sum=0,n;
	int a=0,b=1;
	System.out.print("Enetr the nth value :");
	n= sc.nextInt();
	System.out.println("Fibonacci Series :");
	System.out.println(a+" "+b);
	while(sum <= n)
	{
		sum=a+b;
	   System.out.println(sum+"");
	   a=b;
	   b=sum;
	}
  }
}