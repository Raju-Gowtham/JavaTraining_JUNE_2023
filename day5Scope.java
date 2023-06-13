// java program to check the scope of variable in block in main()
class day5Scope{
    public static void main(String[] args)
	{
	  int i;
	  i=100;// scope of this variable(Instance variable) is within the method
	  System.out.println("Value of i in main method (at first):"+i);
      {
         int j;
         j=55;
         i = i*j;
         System.out.println("value of i in block :"+i);
		 System.out.println("value of j in block :"+j);
	 }
	     System.out.println("value of i in main method (at end):"+i);
		// System.out.println(j); //we get error because the scope of j is within the block
	}
}