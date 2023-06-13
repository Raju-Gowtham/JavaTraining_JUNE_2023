import java.util.Scanner;
class Temperature
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 int c=sc.nextInt();
	 double f=9*c/5.0+32;
	 System.out.println(f);
  }
}