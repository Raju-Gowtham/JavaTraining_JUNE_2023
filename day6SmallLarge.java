//java program to find smallest and largest of 3 numbers
import java.util.*;
class day6SmallLarge{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 int c=sc.nextInt();
	 if(a<b && a<c)
	 System.out.println("Smaller :"+a);
	 else if(b<a && b<c)
	 System.out.println("Smaller :"+b);
     else if(c<a && c<b)
	 System.out.println("Smaller :"+c);
     else
	 System.out.println("All are same");
   }
 }