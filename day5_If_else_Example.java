// java program to divide with zero
import java.util.*;
class day5_If_else_Example{
    public static void main(String[] args)
	{
	  int min,max;
	  Scanner sc=new Scanner(System.in);
	  int i=sc.nextInt();
	  int j=sc.nextInt();
	  if(j==0)
	  System.out.println("Division is not possible");
	 else
      System.out.println(i+" divided by "+j+" is "+(i/j));	 
	 }
}