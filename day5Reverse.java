// java program to  print reverse of a number
import java.util.Scanner;
class day5Reverse{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter a number :");
	  int num=sc.nextInt();
	  int rev=0,rem=0;
	  while(num != 0 )
	  { 
	    rem = num % 10;
		rev = rev*10 + rem;
		num = num / 10;
	  }
	System.out.println("reverse of a number is "+rev);
  }
 }