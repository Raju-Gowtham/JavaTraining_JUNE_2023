import java.util.Scanner;
class day10Pattern
{
    public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  char ch=sc.next().charAt(0);
	  int n=sc.nextInt();
	  int space=n-1;
	  for(int i=1;i<=n;i++)
	  {
	    for(int j=1;j<=space;j++)
		{
		   System.out.print("#");
		}space--;
		for(int j=1;j<=(2*i)-1;j++)
		{
		System.out.println();
		}
	 }
	}
}