// java program to print sum of 1st n natural numbers
import java.util.Scanner;
class day5Power{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	   int a=sc.nextInt();
	  int b=sc.nextInt();
	  int res=a;
	  for(int i=1;i<=b;i++)
	  {
	    res = res*a;
		i++;
	}
	System.out.println(res);
  }
 }