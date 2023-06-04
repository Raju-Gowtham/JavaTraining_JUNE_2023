//java program to find area of rectangle
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
class Day4RectangleArea{
	 public static void main(String[] args)
	 {
	   Rectangle R1;//stack memory
	   R1=new Rectangle();//heap memory
	   Rectangle R2=new Rectangle();
	   R1.insert(2,3);
	   R2.insert(3,4);
	   R1.Solution();
	   R2.Solution();
	  }// main()
}//class