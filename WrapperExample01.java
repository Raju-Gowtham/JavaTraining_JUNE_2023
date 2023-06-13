// java program to convert primitive into objects
// autoboxing example of int to integer
class WrapperExample01{
   public static void main(String[] args)
   {
     // converting int into integer
	 int a=20;
	 Integer i=Integer.valueOf(a);//converting int into integer explicitly
	 Integer j=i;//autoboxing,now compiler will write Integer.valueOf(a) internally
	 System.out.println(a+" "+i+" "+j);
   }
}