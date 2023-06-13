// java program by implementing this keyword
class Student
{
  int rollno;
  String name;
  float fee;
  Student(int rollno,String name,float fee)
  {
  this.rollno = rollno;
  this.name = name;
  this.fee = fee;
  }
  void display()
  {
   System.out.println(rollno+" "+name+" "+fee);
  }
}
  class day7TestThis
  {
    public static void main(String args[])
	{
	   Student s1=new Student(111,"raju",5000f);
	   Student s2=new Student(112,"gowtham",5068f);
	   s1.display();
	   s2.display();
	}
  }