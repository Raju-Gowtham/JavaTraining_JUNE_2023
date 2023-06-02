//Swaping of Two numbers without using "_Temp_"
import java.util.Scanner;
class Inputswap2{
    public static void main(String args[])
	{
	  Scanner scob = new Scanner(System.in);
	  int num1,num2;
	  num1 = scob.nextInt();//5
	  num2 = scob.nextInt();//7
	  num1 = num1+num2;//12(5+7)
	  num2 = num1-num2;//5(12-7)
	  num1 = num1-num2;//7(12-5)
	  System.out.println(num1+"\n"+num2);
	 }//main
	}//Inputswap2