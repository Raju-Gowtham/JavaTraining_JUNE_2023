// java program to print cube of a number using static method
class day8Calculator
{
 static int cube(int x)
 {
  return x*x*x;
 }
  public static void main(String args[])
  {
    int result=day8Calculator.cube(5);
	System.out.println(result);
  }
}