// pattern with following pattern
/*
  0
  1,2
  3,4,5
  6,7,8,9
  10,11,12,13
*/

import java.util.*;
class pattern02
{
	static int x=0;
	public static void printNum(int n)
	{
      for(int i=0;x<=n;i++)
	  { 
         caller(i);
		 System.out.println();
	  }
	}
	public static void caller(int stop)
	{
       for(int i=0;i<=stop;i++)
	   { 
           System.out.print(x++);
          if(i<stop)
			  System.out.print(",");
	   }   
	}
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	/* for(int i=1;i<n;i++)
	 {
	   
	   for(int j=1;j<=i;j++)
	   {
		   if(j != i)
	     System.out.print(count+",");
	 else
		 System.out.print(count);
		 count++;
	   }
	   System.out.println();
	 }*/
	 printNum(n);
   }
}