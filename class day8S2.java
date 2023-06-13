// java program to
class day8S2
{
     void m(S2 obj)
	 {
	    System.out.println("Method is Invoked");
	 }
	 void p()
	 {
	  m(this);
	 }
	 public static void main(String args[])
	 {
	 S2 s1=new S2();
     s1.p();
	 }
} 