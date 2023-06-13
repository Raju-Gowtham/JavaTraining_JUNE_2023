//java program to create and call a default constructor
class day7Student02{
    int id;
	String name;
	int age;
	day7Student02(int i,String n)
	{
	   id =i;
	   name=n;
	}
	day7Student02(){}
	void display()
	{
	  System.out.println(id+" "+name);
	}
  public static void main(String[] args)
  {
    day7Student02 s1=new day7Student02(234,"raju");
	day7Student02 s2=new day7Student02();
	s2.id = s1.id;
	s2.name = s1.name;
	s1.display();
	s2.display();
  }
 }