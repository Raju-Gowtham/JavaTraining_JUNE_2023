// java program to print multiple stars
class day6PrintStars{
    public static void print_multiple_stars(int i)
	{
	   int k=1;
	   for(;k<=i;k++)
	   System.out.print(" * ");
	}
   public static void main(String[] args)
   {
     int j=5;
	 System.out.println("");
     print_multiple_stars(j);
	 System.out.println("");
   }
}