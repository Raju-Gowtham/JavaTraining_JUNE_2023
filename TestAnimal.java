// java program for runtime polymorphism (Method overriding)
class Animal
{
   public void move()
   {
    System.out.println("call from animal class");
   }
}
class Wild extends Animal
{
  public void move()
  {
    System.out.println("call from wild class");
  }
}
class Pet extends Animal
{
  public void move()
  {
    System.out.println("call from Pet class");
  }
}
class TestAnimal
{
  public static void main(String args[])
  {
      Animal a=new Animal();//Animal reference and object
	  Animal w=new Wild();//Animal reference but Wild object
	  Animal p=new Pet();//Animal reference but Pet object
	  a.move();//runs the method in Animal class
	  w.move();//runs the method in Wild class
	  p.move();//runs the method in Pet class
  }
}