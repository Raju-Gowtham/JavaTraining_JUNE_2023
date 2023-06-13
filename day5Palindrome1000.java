// java program to  print reverse of a number
import java.util.Scanner;
class day5Palindrome1000{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter a number :");
	 
	
	  for(int i=1;i<=1000;i++)
	  {
		int temp=i;
	  int rev=0,rem=0;
	  while(i != 0 )
	  { 
	    rem = i % 10;
		rev = rev*10 + rem;
		i = i / 10;
	  }
	  if(temp == rev)
	  System.out.println(temp);
	  rev=0;
	  rem=0;
	}
  }
 }