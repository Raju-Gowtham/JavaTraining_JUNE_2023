//java program by implementing final variable
class day8Bike9
{
   final int speedlimit=90;//final variable(error)
   void run()
   {
     speedlimit=400;// error: cannot assign a value to final variable speedlimit
	 System.out.println(speedlimit);
   }
   public static void main(String args[])
   {
    day8Bike9 obj=new day8Bike9();
   obj.run();	
   }
}