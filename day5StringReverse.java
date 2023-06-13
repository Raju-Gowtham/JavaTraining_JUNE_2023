// java program to  print reverse of string
import java.util.Scanner;
class day5StringReverse{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("enter a name :");
	  String name=sc.next();
	  String rev_name="";
	  int product=1,rem=0;
	  int len=name.length()-1;
	  for(int i=len;i>=0;i--)
	  {
	       rev_name=rev_name+name.charAt(i);
	  }
	System.out.println(rev_name);
  }
 }