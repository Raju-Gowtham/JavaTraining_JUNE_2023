// java program to  print sum of digits of a number
import java.util.Scanner;
class day5NumberSum{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter a number :");
	  int num=sc.nextInt();
	  int sum=0,rem=0;
	  while(num != 0 )
	  { 
	    rem = num % 10;
		sum = sum + rem;
		num = num / 10;
	  }
	System.out.println("reverse of a number is "+sum);
  }
 }