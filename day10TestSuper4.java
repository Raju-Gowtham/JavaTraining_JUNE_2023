// java program by calling constructor from base class to derived class
class Animal
{
  Animal()
  {
     System.out.println("Animal is created");
  }
}
class Dog extends Animal
{
  Dog()
  {
    System.out.println("Dog is created");
  }
}
class day10TestSuper4
{
   public static void main(String args[])
   {
     Dog d=new Dog();
   }
}