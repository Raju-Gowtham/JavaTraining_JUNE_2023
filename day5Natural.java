// java program to print sum of 1st n natural numbers
import java.util.Scanner;
class day5Natural{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter a number :");
	  int n=sc.nextInt();
  int sum=0,i;
  //String str="";
   for(i=1;i<=n;i++)
   { 
	 sum=sum+i;
	// str =str+i+"+";
   }
    System.out.println(sum);
	/*System.out.print("EXPLANATION 1 : ");
	for(int i=0;i< str.length()-1;i++)
		System.out.print(str.charAt(i));
	System.out.println(" = "+sum);*/
	 System.out.print("EXPLANATION : ");
	i=1;
	while(i<=n)
	{
		if(i!=n)System.out.print(i+"+");
		else System.out.print(i);
		i++;
	}
		System.out.print(" = "+sum);
  }
 }