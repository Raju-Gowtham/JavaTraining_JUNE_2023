// java program for threads
class cal extends Thread
{
  public static void main(String args[])
  {
    cal obj=new cal();
	Thread threadobj=new Thread(obj);
	threadobj.start();
	System.out.println("Threads inside main are very much helpful in java");
  }
  public void run()
  {
    System.out.println("threads from overridden run methid are ");
  }
}