//java program to initialize objects by using methods
class Student{
     int id;
	 String name;
	 void insertRecord(int r,String n)
	 {
	   id = r;
	   name = n;
	  }
	  void displayInformation()
	  {
	    System.out.println(id+" "+name);
	}
}
class Day4Student04{
	 public static void main(String[] args)
	 {
	   Student s1=new Student();
	   Student s2=new Student();
	   s1.insertRecord(123,"raju");
	   s2.insertRecord(128,"gowtham");
	   s1.displayInformation();
	   s2.displayInformation();
	  }// main()
}//class