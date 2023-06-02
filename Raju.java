class Greeting{
   public void funA1(){
     System.out.print("FunA1 called from class A");
	 }
   public void funA2(){
     System.out.print("FunA2 called from class A");
	 }
}
class TestGreeting{
   public static void main(String args[])
   {
     Greeting ob = new Greeting();
	 ob.funA1();
	 ob.funA2();
	}
}