// java program to initialize instance variable through reference
class Student{
     int id;
	 String name;
}
class Day4Student02{
	 public static void main(String[] args)
	 {
	   Student s1=new Student();
	   s1.id=25574;
	   s1.name="Raju Gowtham";
	   System.out.println(s1.id);
	   System.out.println(s1.name);
	  }// main()
}//class