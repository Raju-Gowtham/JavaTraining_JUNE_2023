// java program to  print reverse of string without using built in methods
import java.util.Scanner;
class day7PalindromeWithoutBuiltIn{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter a name :");
	  String str=sc.next();
	  String rev=str;
	  String temp="";
	  int ascii;
	  int len=str.length()-1;
	  for(int i=len;i>=0;i--)
	  {
	     if(str.charAt(i)>= 'A' && str.charAt(i)<= 'Z' )
	      {
		    ascii = str.charAt(i);
			ascii += 32;
			temp = temp +(char)ascii;
		  }
		  else
		  temp += str.charAt(i);
	  }
	  System.out.println(temp);
	  System.out.println(rev);
	if(temp.equals(rev) )
	System.out.println("YES");
	else
	System.out.println("NO");
  }
 }