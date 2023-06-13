// sample java program to find number of consonants in a file 
import java.io.*;
class FileReadCons
{
    public static void main(String args[]) throws Exception
	{
	   FileReader fr=new FileReader("E:\\fh\\demo.txt");
	   BufferedReader br=new BufferedReader(fr);
	   int i;
	   int count_cons=0;
	   //int[] ary={'a','e','i','o','u'};
	   while((i=br.read())!= -1)
	  {
	    char ch=(char)i;
		if((ch != 'a')&&(ch != 'e')&&(ch != 'i')&&(ch != 'o')&&(ch != 'u')&&
		   (ch != '1')&&(ch != '2')&&(ch != '3')&&(ch != '4')&&(ch != '5')&&
		   (ch != '0')&&(ch != '9')&&(ch != '8')&&(ch != '7')&&(ch != '6'))
		count_cons++;
      }
	    System.out.println(count_cons);
	}
}