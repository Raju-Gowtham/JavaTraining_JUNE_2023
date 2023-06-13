// java program to demonstrate the use of static variable 
class Student
{
   int rollno; //instance variable
   String name;
   static String college="TCS";//static variable
   //constructor
   Student(int r,String n)
   {
      rollno = r;
      name = n;	  
   }
   //method to diaplay the values
   void display()
   {
     System.out.println(rollno+" "+name+" "+college);
   }
}
class day8TestStatic
{
  public static void main(String args[])
  {
   Student s1=new Student(121,"raju");
   Student s2=new Student(123,"Gowtham");
   //modifying the college of all objects by the single line of code
   Student.college="MTIET";
   s1.display();
   s2.display();
  }
}