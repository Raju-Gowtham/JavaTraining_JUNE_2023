// sample java program to read a text file 
import java.io.*;
class FileRead1
{
    public static void main(String args[]) throws Exception
	{
	   FileReader fr=new FileReader("E:\\fh\\demo.txt");
	   BufferedReader br=new BufferedReader(fr);
	   int i;
	   int count_vowel=0;
	   char[] ary={'a','e','i','o','u','A','E','I','O','U'};
	   while((i=br.read())!= -1)
	   {  
         char ch=(char)i;
		 for(int j=0;j<ary.length;j++)
		 {
			 if(ary[j] == ch)
				 count_vowel++;
		 }
	   }
	    System.out.println(count_vowel);
	   br.close();
	   fr.close();
	}
}