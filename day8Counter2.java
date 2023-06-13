// java program to illustrate the us eof static variable which is shared with all the objects
class day8Counter2
{
  static int count=0;//will get memory only once and retain its value
  day8Counter2()
  {
    count++;//Incrementing the value of static variable
	System.out.println(count);
  }
  public static void main(String[] args)
  {
    //creating objects
	day8Counter2 c1=new day8Counter2();
	day8Counter2 c2=new day8Counter2();
	day8Counter2 c3=new day8Counter2();
  }

}