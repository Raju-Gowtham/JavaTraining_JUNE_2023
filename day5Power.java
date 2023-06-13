// java program to  print power of one  number to another
import java.util.Scanner;
class day5Power{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter base number :");
	   int a=sc.nextInt();
	   System.out.print("Enter power number :");
	  int b=sc.nextInt();
	  int res=1;
	  for(int i=1;i<=b;i++)
	  {
	    res = res*a;
	}
	System.out.println(a+" power "+b+" is "+res);
  }
 }