// java program to print stars,+'s,-'s
class day6Print_stars_plus_minus{
    public static void print_multiple_chars(int i,char c)
	{
	   int k=1;
	   for(;k<=i;k++)
	   System.out.print(c);
	}
   public static void main(String[] args)
   {
	 int j=5;
     print_multiple_chars(j,'x');
	 print_multiple_chars(j+1,'+');
	 print_multiple_chars(j+2,'-');
   }
}