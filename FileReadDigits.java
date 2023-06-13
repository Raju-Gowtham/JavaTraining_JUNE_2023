// sample java program to read a text file 
import java.io.*;
class FileReadDigits
{
    public static void main(String args[]) throws Exception
	{
	   FileReader fr=new FileReader("E:\\fh\\demo1.txt");
	   BufferedReader br=new BufferedReader(fr);
	   int i;
	   int count_Digits=0;
	   int[] ary={'1','2','3','4','5','6','7','8','9','0'};
	   while((i=br.read())!= -1)
	   {  
           char ch=(char)i;
		 for(int j=0;j<ary.length;j++)
		 {
			 if(ary[j] == ch)
				 count_Digits++;
		 }
	   }
	    System.out.println(count_Digits);
	   br.close();
	   fr.close();
	}
}