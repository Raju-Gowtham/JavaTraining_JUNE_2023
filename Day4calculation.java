// java program to create object using anonymous object 
class Day4Calculation{
  void fact(int n)
  {
    int fact=1;
	for(int i=1;i<=n;i++)
	{
	fact=fact*i;
	}
	System.out.println("factorial is "+fact);
  }
public static void main(String args[])
{
  new Day4Calculation().fact(5);//calling method with anonymous object
 }
}