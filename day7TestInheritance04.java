// java program to implement Hierarchical Inheritance
class C
{
   public void disp()
   {
     System.out.println("Method of class c");
   }
 }
 class A extends C
 {
   public void disp()
   {
    System.out.println("Method of class A");
   }
 }
 class B extends C
 {
   public void disp()
   {
    System.out.println("Method of class B");
   }
 }
 class day7TestInheritance04 extends A
 {
	public void disp()
   {
    System.out.println("Method of class D");
   }
   public static void main(String args[])
   {
     day7TestInheritance04 d=new day7TestInheritance04();
	 d.disp();
   }
 }