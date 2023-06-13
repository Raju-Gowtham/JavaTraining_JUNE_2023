// java program to  print product of digits of a number
import java.util.Scanner;
class day5NumberProduct{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter a number :");
	  int num=sc.nextInt();
	  int product=1,rem=0;
	  while(num != 0 )
	  { 
	    rem = num % 10;
		product = product * rem;
		num = num / 10;
	  }
	System.out.println("Product of digits is "+product);
  }
 }