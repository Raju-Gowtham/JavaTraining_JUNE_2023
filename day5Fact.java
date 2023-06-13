// java program to print sum of 1st n natural numbers
import java.util.Scanner;
class day5Fact{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  int count=1;
	  System.out.print("enter a number :");
	  int n=sc.nextInt();
	  int i=1,fact=1;
	  while(i<=n)
	  {
	    fact = fact*i;
		i++;
	}
	System.out.println("factorial of "+n+" is "+fact);
  }
 }