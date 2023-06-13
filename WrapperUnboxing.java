/*
 Wrapper class: Wrapper class is a mechanism which will be used
   to convert primitive type to objects and objects to primitive
*/
// java program to convert objects into primitive
// unboxing example of integer to int 
class WrapperUnboxing{
   public static void main(String[] args)
   {
     // converting  integer into int
	 Integer a=new Integer(3);
	 int i=a.intValue();//converting Integer into int explicitly
	 int j=a;//unboxing,now compiler will write a.intValue() internally
	 System.out.println(a+" "+i+" "+j);
   }
}