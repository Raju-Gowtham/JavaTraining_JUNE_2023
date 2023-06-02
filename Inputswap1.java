//Swaping of Two numbers using "_Temp_"
import java.util.Scanner;
class Inputswap1{
    public static void main(String args[])
	{
	  Scanner scob = new Scanner(System.in);
	  int num1,num2,temp;
	  num1 = scob.nextInt();
	  num2 = scob.nextInt();
	  temp = num1;
	  num1 = num2;
	  num2 = temp;
	  System.out.println(num1+"\n"+num2);
	 }//main
	}//class