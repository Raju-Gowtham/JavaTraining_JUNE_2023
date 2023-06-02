//Display even or odd
import java.util.Scanner;
public class Program202b{	

    public static void main(String args[])
	{
	  Scanner sc= new Scanner(System.in);
	  int n;
	  System.out.print("Enter a number:");
	  n = sc.nextInt();
	  if(n/2*2==n) {
	    System.out.println("Even");
	  }
	  else {
	    System.out.println("Odd");
	  }
	 }//main
	}//Program201