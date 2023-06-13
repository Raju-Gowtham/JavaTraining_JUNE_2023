// java program to check whether the number is plaindrome or not
import java.util.Scanner;
class day6PalindromeNum{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter a number :");
	   int num = sc.nextInt();
	   int temp=num;
	  int rev=0,rem=0;
	  while(num != 0 )
	  { 
	    rem = num % 10;
		rev = rev*10 + rem;
		num = num / 10;
	  }
	  if(temp == rev)
	  System.out.println(temp+" is Palindrome");
	  else
	  System.out.println(temp+" is not Palindrome");
	  
  }
 }