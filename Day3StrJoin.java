// java program for String concatination using join()
class Day3StrJoin{
  public static void main(String[] args)
  {
    String s1=new String("Hello");
	String s2=new String("World");
	String s3=new String("Java");
	String s=String.join("#",s1,s2,s3);//using join method
	System.out.println(s.toString());
	
	}
}
	
	