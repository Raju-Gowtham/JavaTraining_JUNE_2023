class B{
  public static void main(){
     System.out.println("Main method without argument called.");
	}
  public static void main(String args[]){
     System.out.println("Anil is Typing");
	 main();
	 main(10,2);
	}
	public static void main(int x,int y){
	 System.out.println("Main method with argument called "+x*y);
	}
}