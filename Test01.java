class ChildThread extends Thread
{
  public void run()
  {
   for(int i=1;i<=4;i++)
   {
     try{
	     Thread.sleep(500);
	 }catch(Exception e)
	 {
	    System.out.println(e);
	 }
	 System.out.println("Child thread execution - "+i);
   }
  }
}
class Test01
{
   public static void main(String args[]) throws Exception
   {
     ChildThread th1=new ChildThread();
	 //starting child thread
	 th1.start();
	 //main thread joining the childthread
	 th1.join();
	 //main thread printing the statements
	 System.out.println("main thread completed");
   }
}