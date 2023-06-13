//java program by implementing final class  ( final class can't be inherited)
class Bike
{
	 void run()
	{
	  System.out.println("running safely with 100kmph");
	}
}
  class day8Honda1 extends Bike
  {
	 public static void main(String args[])
   {
     day8Honda1 obj=new day8Honda1();
	 obj.run();
   }
  }