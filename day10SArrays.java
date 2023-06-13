import java.util.Scanner;
import java.util.Arrays;
class day10SArrays
{
  public static void main(String[] args)
  {
    int n,i=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter no.of elements you want in array:");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter all the elements:");
	int temp=0;
	for(i=0;i<n;i++)
	{
	  a[i]=sc.nextInt();
	  temp+= a[i];
	}
	int second=0;
	
	//code for array sorting
	Arrays.sort(a);
	for(i=0;i<n-1;i--)
	{
		  if(a[n-1] > a[i])
		  {
			  
		  }
	      else
		  {
			  second = a[i+1];
			  break;
		  }
	}
	//code for array sorting without using sort()
	/*for(i=0;i<=a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			int temp=0;
			if(a[i] > a[j]) //swap a[i] and a[j] ; if a[i] > a[j] ==> assending order else descending order
		    {
				temp = a[i];  
               a[i] = a[j];  
                a[j] = temp	;		
			}
		}//for inner loop
	}//for outer loop*/
	System.out.println(a[0]+" "+a[n-1]);
	System.out.println("second :"+second);
	System.out.println("sum :"+temp);
	System.out.println("Average :"+(double)temp/n);
  }
}