//java program to initialize objects by using Constructor
class Student{
     int id;
	 String name;
	 Student(){
	      id = 0;
	   name = null;
	   }
	 Student(int r,String n)
	 {
	   id = r;
	   name = n;
	  }
	  void displayInformation()
	  {
	    System.out.println(id+" "+name);
	}
}
class Day4Student05{
	 public static void main(String[] args)
	 {
	   Student s1;//stack memory
	   s1=new Student();//heap memory
	   Student s2=new Student(111,"raju");
	   s1.displayInformation();
	   s2.displayInformation();
	  }// main()
}//class