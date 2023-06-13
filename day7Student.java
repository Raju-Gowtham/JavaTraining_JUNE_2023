//java program to create and call a default constructor
class day7Student{
    int id;
	String name;
	int age;
	//creating two arg constructor
	day7Student(int i,String n)
	{
	   id =i;
	   name=n;
	}
	// creating three args constructor
	day7Student(int i,String n,int a)
	{
	   id = i;
	   name = n;
	   age = a;
	}
	void display()
	{
	  System.out.println(id+" "+name+" "+age);
	}
  public static void main(String[] args)
  {
    day7Student s1=new day7Student(234,"raju");
	day7Student s2=new day7Student(456,"gowtham",19);
	s1.display();
	s2.display();
  }
 }