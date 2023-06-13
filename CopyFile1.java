// sample java program to write file from another file 
class CopyFile1
{
   public static void main(String args[])
   {
     FileReader fr=new FileReader("E:\\fh\\a.txt");
	 BufferedReader br=new BufferedReader(fr);
	 CharArrayWriter out=new CharArrayWriter();
	 int i;
	 while((i=br.read())!=-1)
	 {
	   out.write((char)i);
	 }
	 FileWriter f1=new FileWriter("E:\\fh\\b.txt");
	 out.writeTo(f1);
	 f1.close();
	 System.out.println("success...");
   }
}