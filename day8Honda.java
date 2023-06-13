//java program by implementing final method(method overriding can't be done)
class Bike
{
  final void run()
  {
    System.out.println("running");
  }
}
class day8Honda extends Bike
{
   void run()
   {
      System.out.println("running safely with 100kmph");
   }
   public static void main(String args[])
   {
     day8Honda obj=new day8Honda();
	 obj.run();
   }
}