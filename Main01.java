// use is.Alive() to prevent concurrency problems
class Main01 extends Thread
{
   public static int amount=0;
   public static void main(String args[])
   {
     Main01 thread=new Main01();
	 thread.start();
	 //wait for the thread to finish
	 while(thread.isAlive())
	 {
	   System.out.println("waiting...");
	 }
	 //update amount and print its value
	 System.out.println("Main :"+amount);
	 amount++;
	 System.out.println("Main :"+amount);
   }//main()
   public void run()
   {
     amount++;
   }
}