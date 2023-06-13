class CommandLineExample03
{
  public static void main(String args[])
  {
      int num1=Integer.parseInt(args[0]);
	  int num2=Integer.parseInt(args[1]);
	  System.out.println("sum :"+(num1+num2));
	  System.out.println("Difference :"+(num1-num2));
	  System.out.println("Product :"+(num1*num2));
	  System.out.println("division :"+(num1/num2));
	  System.out.println("Modulus :"+(num1%num2));
	  System.out.println(num1>=num2);
	  System.out.println(num1<num2);
	  float num3=Float.parseFloat(args[2]);
	  float num4=Float.parseFloat(args[3]);
	  System.out.println("Float Sum :"+(num3+num4));
	  Double num5=Double.parseDouble(args[4]);
	  Double num6=Double.parseDouble(args[5]);
	  System.out.println("Double Sum :"+(num5+num6));
  }
}