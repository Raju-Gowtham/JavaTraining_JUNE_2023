// java program to print right angled traingle
import java.util.Scanner;
class day6PrintTopRightTriangle{
    public static void print_multiple_chars(int n,char c)
	{
	   for(int i=0;i<=n;i++)
	   {
	       for(int j=0;j<=i;j++)
	      {
	       System.out.print(c);
	      }
		  System.out.println();
	   }
	}
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	char c=sc.next().charAt(0);
	int n=sc.nextInt();
    print_multiple_chars(n,c);
   }
}