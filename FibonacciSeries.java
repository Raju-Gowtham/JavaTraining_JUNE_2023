//java program to generate fabonacci series upto n value
import java.util.Scanner;
class FibonacciSeries
{
  public static void main(String abc[])
  {
    Scanner sc=new Scanner(System.in);
	int sum=0,n;
	int a=0,b=1;
	System.out.print("Enetr the nth value :");
	n= sc.nextInt();
	System.out.println("Fibonacci Series :");
	while(sum <= n)
	{
	   System.out.println(sum+"");
	}
  }
}