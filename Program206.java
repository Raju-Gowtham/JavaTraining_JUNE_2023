//java program to check whether the character is an alphabet or not 
import java.util.*;
public class Program206
{
   public static void main(String[] args)
   {
      char ch;
	  System.out.print("Enter a character:");
	  Scanner sc=new Scanner(System.in);
	  ch = sc.next().charAt(0);
	  System.out.println();
	  if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
	  System.out.println(ch+ " is an alphabet");
	  else if(ch>='0' && ch<='9')
	  System.out.println(ch+" is a digit");
	  else
	  System.out.println(ch+" is Special symbol");
	}
}