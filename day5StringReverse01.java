// java program to  print reverse of string
import java.util.Scanner;
class day5Palindrome{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter a name :");
	  String name=sc.next();
	  String name_c = name;
	  String rev_name="";
	  int product=1,rem=0;
	  int len=name.length()-1;
	  for(int i=len;i>=0;i--)
	  {
	       rev_name=rev_name+name.charAt(i);
	  }
	if(rev_name.equals(name) )
	System.out.println("Palindrome");
	else
	System.out.println("Not Palindrome");
  }
 }