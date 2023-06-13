
// java program to check the scope of variable in block in main()
import java.util.*;
class day5MinMax{
    public static void main(String[] args)
	{
	  int min,max;
	  Scanner sc=new Scanner(System.in);
	  int i=sc.nextInt();
	  int j=sc.nextInt();
	  if(i>j)
	  {
	    min = j;
		max = i;
			System.out.println("minimum :"+min);
		System.out.println("maximum :"+max);
		}
	else if(i<j)
	{
	  min = i;
		max = j;
		System.out.println("minimum :"+min);
		System.out.println("maximum :"+max);
	  }
	  else{
	     System.out.println("both are same");
	  }
	}
}