import java.util.Scanner;
import java.util.Arrays;
class SortElement
{
  public static void main(String[] args)
  {
    int n,i=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter no.of elements you want in array:");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter all the elements:");
	for(i=0;i<n;i++)
	{
	  a[i]=sc.nextInt();
	}
	//code for array sorting
	//Arrays.sort(a);
	//code for array sorting without using sort()
	for(i=0;i<=a.length;i++)
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
		}
	}
	//display array
	for(int j:a)
	System.out.print(j+" ");
  }
}