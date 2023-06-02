import java.util.Scanner;
public class Program204{
      public static int diff(int a,int b)
     {
	    return a-b;
	 }	  
	 public static int pro(int a,int b)
     {
	    return a*b;
	 }	 
	 public static int smallest(int a,int b)
     {
	    if(a<b) return a;
		else return b;
	 }	
      public static int largest(int a,int b)
     {
	    if(a<b) return b;
		else return a;
	 }	 	 
      public static void main(String args[])
	{
	  Scanner sc= new Scanner(System.in);
	  int a,b,result;
	  System.out.print("Enter a number:");
	  a = sc.nextInt();
	  System.out.print("Enter a number:");
	  b = sc.nextInt();
	  result = diff(a,b);
	  System.out.println("Difference :"+result);
	  result = pro(a,b);
	  System.out.println("Product :"+result);
	  result = smallest(a,b);
	  System.out.println("Smallest :"+result);
	  result = largest(a,b);
	  System.out.println("largest :"+result);
	}
}
 