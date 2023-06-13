//java program to create and call a default constructor
//constructor to initialize values through object
class day7Student01{
    int id;
	String name;
	int age;
	day7Student01(int i,String n)
	{
	   id =i;
	   name=n;
	}
	day7Student01(day7Student01 s)
	{
	   id =s.id;
	   name=s.name;
	}
	void display()
	{
	  System.out.println(id+" "+name);
	}
  public static void main(String[] args)
  {
    day7Student01 s1=new day7Student01(234,"raju");
	day7Student01 s2=new day7Student01(s1);
	s1.display();
	s2.display();
  }
 }