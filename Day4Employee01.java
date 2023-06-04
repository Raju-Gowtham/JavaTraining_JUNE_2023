//java program to initialize objects throgh functions
class Employee{
     int id;
	 String name;
	 float salary;
	 void insert(int i,String n,float s){
	      id = i;
	   name = n;
	   salary=s;
	   }
	  void displayInformation()
	  {
	    System.out.println(id+" "+name+" "+salary);
	}
}
class Day4Employee01{
	 public static void main(String[] args)
	 {
	   Employee E1;//stack memory
	   E1=new Employee();//heap memory
	   Employee E2=new Employee();
	   Employee E3=new Employee();
	   E1.insert(111,"raju",2300);
	   E2.insert(12,"akhil",2356);
	   E3.insert(117,"arun",2645);
	   E1.displayInformation();
	   E2.displayInformation();
	   E3.displayInformation();
	  }// main()
}//class