// java program 
/*
             ---- Data types Priorities(Top to Bottom) -----
			       
				   (1)-> byte
                   (2)-> short
                   (3)-> int
                   (4)-> long
                   (5)-> float 
				   (6)-> double
*/
class day6DataTypes{
   public static void main(String args[])
   {
      int i=2;
      byte b=45;
      double d=34.567;
	  //Implicit conversion takes place in below steps
      System.out.println(i*b+d/i-b);	  
	  System.out.println(((i*b)+(d/i))-b);	 
	  System.out.println(((2*45)+(34.567/2))-45);	 
   }
}