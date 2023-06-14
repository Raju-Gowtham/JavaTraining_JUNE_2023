import java.util.StringTokenizer;
public class StringTokenizer1
{
 public static void main(String args[])
  {
    //StringTokenizer object
	StringTokenizer st=new StringTokenizer("Demonstarting methods from StringTokenizer class");
	//checks if the String has any more tokens
	while(st.hasMoreTokens())
	{
	  System.out.println(st.nextToken());
	}
  }
}