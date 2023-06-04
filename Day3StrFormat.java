// java program for String concatination using strFormat
class Day3StrFormat{
  public static void main(String[] args)
  {
    String s1=new String("Hello");
	String s2=new String("World");
	String s=String.format("%s%s",s1,s2);
	System.out.println(s.toString());//HelloWorld
	}
}
	
	