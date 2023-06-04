//java program to initialize objects throgh functions
class Employee{
     int id;
	 String name;
	 double salary;
	 void insert(int i,String n,double s){
	      id = i;
	   name = n;
	   salary=s;
	   }
	  void displayInformation()
	  {
	    System.out.println(id+" "+name+" "+salary);
	}
}
class Day4Student06{
	 public static void main(String[] args)
	 {
	   Employee s1;//stack memory
	   s1=new Employee();//heap memory
	   Employee s2=new Employee();
	   Employee s3=new Employee();
	   s1.insert(111,"raju",23.00);
	   s2.insert(12,"akhil",23.56);
	   s3.insert(117,"arun",26.45);
	   s1.displayInformation();
	   s2.displayInformation();
	   s3.displayInformation();
	  }// main()
}//class