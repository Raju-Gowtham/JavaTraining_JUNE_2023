import java.util.*;
import java.lang.*;
class Last
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	char str[]=sc.next();
	char ch=sc.next().charAt(0);
	String Strnew=str.remove(ch);
	System.out.println(Strnew);
  }
}