import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class WorkerThread implements Runnable
{
   private String message;
   public WorkerThread(String s)
   {
     this.message=s;
   }
   public void run()
   {
     System.out.println(Thread.currentThread().getName()+"(start)message="+message);
	 processmessage();//call processmessage method that sleeps the thread 
	 System.out.println(Thread.currentThread().getName()+"(End)");//print 
   }
   private void processmessage()
   {
      try{
	   Thread.sleep(2000);
   }catch(InterruptedException e)
   {
     e.printStackTrace();
   }
   }
}
class TestThreadPool
{
  public static void main(String args[])
  {
     ExecutorService executor=Executors.newFixedThreadPool(5);
	 for(int i=0;i<10;i++)
	 {
	   Runnable worker=new WorkerThread(""+i);
       executor.execute(worker);//calling execute method	   
	 }
	 executor.shutdown();
	 while(!executor.isTerminated()){ }
	  System.out.println("Finished all threads");
  }
}