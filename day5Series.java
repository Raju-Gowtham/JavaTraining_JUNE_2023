// java program to print sum of 1st n natural numbers
import java.util.Scanner;
class day5Series{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  int count=1;
	  System.out.print("enter a number :");
	  int n=sc.nextInt();
	  while(count<=n)
	  {
	    if(count == n)
		 System.out.print(count);
	 else
		System.out.print(count+","); 
		count++;
	}
  }
 }