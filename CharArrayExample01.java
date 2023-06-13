import java.io.CharArrayReader;
public class CharArrayExample01
{
    public static void main(String[] ag) throws Exception
	{
	  char[] ary={'j','a','v','a','t','p','o','i','n','t'};
	  CharArrayReader reader=new CharArrayReader(ary);
	  int k=0;
	  //read until the end of a file
	  int count_vowel=0;
	  while((k=reader.read())!= -1)
	  {
	    char ch=(char)k;
		if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u')
		count_vowel++;
      }
	  System.out.println(count_vowel);
	}
}