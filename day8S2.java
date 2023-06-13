// java program to
class day8S2
{
     void m(day8S2 obj)
	 {
	    System.out.println("Method is Invoked");
	 }
	 void p()
	 {
	  m(this);
	 }
	 public static void main(String args[])
	 {
	 day8S2 s1=new day8S2();
     s1.p();
	 }
} 