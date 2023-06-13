// java program using static variables,methods and classes.(nested static classes)
class day8TestOuter
{
  static int data=30;
  static class Inner
  {
    void msg()
	{
	  System.out.println("data is "+data);
	}
  }
  public static void main(String args[])
  {
    day8TestOuter.Inner obj=new day8TestOuter.Inner();
	obj.msg();
  }
}