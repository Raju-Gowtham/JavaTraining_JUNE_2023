class Student
{ 
  int rollno;
  String name;
  static String college="ITS";
  //static method to change the value of static variable
  static void change()
  {
    college = "MTIET";
  }
  Student(int r,String n)
  {
     rollno=r;
     name = n;
  }
  //method to diaplay values
  void display()
  {
  System.out.println(rollno+" "+name+" "+college);
  }
}
public class day8TestStaticMethod
{
  public static void main(String args[])
  {
    Student.change();//calling change method
    Student s1=new Student(111,"Raju");
    Student s2=new Student(123,"Gowtham");
    Student s3=new Student(124,"Tharun");
     // calling display method
	 s1.display();
	 s2.display();
	 s3.display();
  }
}