import java.util.*;
class pattern01
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 char sp=sc.next().charAt(0);
	 int n=sc.nextInt();
	 int space=n-1,space1=n-1; 
	 for(int i=1;i<=n;i++)
	 {
	   for(int j=1;j<=space;j++)
	   {
	     System.out.print(sp);
	   }
	   space--;
	   for(int j=1;j<=2*i-1;j++)
	   {
	     System.out.print("*");
	   }
	   for(int j=1;j<=space1;j++)
	   {
	     System.out.print(sp);
	   }space1--;
	   System.out.println();
	 }
   }
}