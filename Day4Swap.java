// Java table for printing multiplication table
// java program to swap two numbers without using 3rd variable
import java.util.Scanner;
class Day4Swap{ 
    public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a+" "+b);
		
	}//main() ends
}//class ends

