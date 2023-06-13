import java.util.*;
class sample
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	String str=sc.next();
	char ch=sc.next().charAt(0);
	String temp="";
	for(int i=0;i<=str.length()-1;i++)
	{
	 if(str.charAt(i) == ch)
	 {}
	 else
	 temp = temp+str.charAt(i);
	}
	System.out.println(temp);
  }
}