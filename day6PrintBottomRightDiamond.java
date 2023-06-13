// java program to print bottom right angled traingle
import java.util.Scanner;
class day6PrintBottomRightDiamond{
    public static void print_multiple_chars(int n,char c)
	{
	   for(int i=0;i<=n;i++)
	   {
	       System.out.print(c);
	   }
	   System.out.println();
	}
	public static void printPatternReverse(int n,char c)
	{
	  for(int i=n;i>=0;i--)
      print_multiple_chars(i,c);
	}
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	char c=sc.next().charAt(0);
	int n=sc.nextInt();
	printPatternReverse(n,c);
	
   }
}