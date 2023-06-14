import java.util.StringTokenizer;
class Simple
{
  public static void main(String args[])
  {
      StringTokenizer st=new StringTokenizer("My name is raju","");
	  while(st.hasMoreTokens())
	  {
	    System.out.println(st.nextToken());
	  }
  }
}