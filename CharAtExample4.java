// java program for festching odd indexes of string 
public class Day3CharAtExample4{
  public static void main(String[] args)
  {
    String str="Welcome to java Training";
	int strLength=str.length();
	for(int i=1;i<=strLength;i++)
	{
	  if(i%2 != 0){
	      System.out.println("The value at index "+i+" place is :"+str.charAt(i));
		  }
		  
	}
	}
}
	
	