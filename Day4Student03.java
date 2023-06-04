// java program to initialize instance variable through reference
class Student{
     int id;
	 String name;
}
class Day4Student03{
	 public static void main(String[] args)
	 {
	   Student s1=new Student();
	   Student s2=new Student();
	   s1.id=25574;
	   s1.name="Raju";
	   s2.id=25575;
	   s2.name="Gowtham";
	   System.out.println(s1.id);
	   System.out.println(s1.name);
	    System.out.println(s2.id);
	   System.out.println(s2.name);
	  }// main()
}//class