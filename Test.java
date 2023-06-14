import java.util.*;
public class Test
{
  public static void main(String args[]) 
  {
    StringTokenizer st=new StringTokenizer("My,name,is,raju");
	//printing next token
	System.out.println("Next token is :"+st.nextToken(","));
	System.out.println("Next token is :"+st.nextToken(","));
	System.out.println("Next token is :"+st.nextToken(","));
	System.out.println("Next token is :"+st.nextToken(","));
  }
}