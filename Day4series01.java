// Java table for printing multiplication table
import java.util.Scanner;
class Day4series01{ 
    public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String str="";
		for(int i=0;i<=a;i=i+b)
		{
		    str =str+i+",";
		}// for loop ends
		for(int i=0;i< str.length()-1;i++)
		System.out.print(str.charAt(i));
	}//main() ends
}//class ends
