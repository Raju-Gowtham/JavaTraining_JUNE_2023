// sample java program to print digits pattern by using methods 
import java.util.*;
class pattern03
{
	public static void printNum(int n)
	{
      for(int i=1;i<=n;i++)
		  System.out.print(i+" ");
	}
	public static void caller(int n)
	{
       for(int i=n;i>=1;i--)
	   { 
           printNum(i);
		   if(i!=1)
			   System.out.println();	   
	   }   
	}
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter any number :");
	 int n=sc.nextInt();
	 caller(n);
   }
}