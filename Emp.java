class Person
{
  int id;
  String name;
  Person()
  {
   this.id=id;
   this.name=name;
  }
}
class Emp extends Person
{
  float salary;
  Emp(int id,String name,float salary)
  {
     super(id,name);//reusing parent constructor
	 this.salary=salary;
  }
   void display()
   {
     System.out.println(id+" "+name+" "+salary);
   }
   public static void main(String args[])
   {
     Emp e=new Emp(111,"raju",23500);
	 e.display();
   }
}