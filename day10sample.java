import java.util.*;
import java.lang.*;
class day10sample
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	char ch=sc.next().charAt(0);
	String s=String.valueOf(ch);//converting char to string by using valueOf() method
	String temp=str.replaceAll(s,""); // replacing the character using replaceAll(String,String)
	System.out.println(temp);
  }
}