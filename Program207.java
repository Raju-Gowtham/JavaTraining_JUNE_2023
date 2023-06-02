// jav program to print ascii value of a character
import java.util.*;
public class Program207
{
   public static void main(String[] args)
   {
      char ch;
	  System.out.print("Enter a character:");
	  Scanner sc=new Scanner(System.in);
	  ch = sc.next().charAt(0);
	  int ASCII;
	  ASCII = (int)ch;//type casting from char to int
	  System.out.println("The ASCII Value of "+ch+" is "+ASCII);
	}
}