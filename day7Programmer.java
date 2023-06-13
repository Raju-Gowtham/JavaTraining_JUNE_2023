// java program to implement inheritance
class Employee{
   float salary=40000;
  }
  class day7Programmer extends Employee{
   int bonus = 10000;
   public static void main(String[] args)
   {
     day7Programmer p=new day7Programmer();
	 System.out.println("Programmer salary is :"+p.salary);
	 System.out.println("Bonus of Programmer is :"+p.bonus);
   }
  }