//java program to find area of rectangle using single class name
class Rectangle{
     int len;
	 int bre;
	 void insert(int i,int j){
	      len = i;
		  bre = j;
	   }
	  void Solution()
	  {
	    System.out.println(len*bre);
	}
}
class Day4RectangleArea01{
	 public static void main(String[] args)
	 {
	   Rectangle R1=new Rectangle(),R2=new Rectangle();// two objects created uisng comma operator
	   R1.insert(2,3);
	   R2.insert(3,4);
	   R1.Solution();
	   R2.Solution();
	  }// main()
}//class