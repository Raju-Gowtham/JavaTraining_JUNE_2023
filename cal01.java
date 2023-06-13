class First
{
  public static void main(String args[])
  {
	  Thread t=Thread.currentThread();
	  System.out.println("CURRENT_THREAD="+t);
	  t.setName("NewThreadbyPawan");
	  t.setPriority(t.getPriority()-1);
	  System.out.println("CURRENT_THREAD="+t);
	  System.out.println("NAME="+t.getName());
  }
}