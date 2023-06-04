// java program to find the frequency of a character
import java.util.Scanner;
public class Day3FrequencyChar{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	char ch=sc.next().charAt(0);
	int count=0;
	for(int i=0;i<=str.length()-1;i++)
	{
	   if(str.charAt(i) == ch)
	   count++;
	   }
	   System.out.println(count);
  }
}
	
	