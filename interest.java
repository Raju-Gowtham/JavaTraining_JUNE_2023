import java.util.*;
public class interest {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double ptr=(a*b*c)/100;
		String str=ptr+"";
        int temp=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            if(str.charAt(i) == '.' &&  str.charAt(i+1) == '')
            {
                temp++;              
            }
        }
        if(temp != 1 )
        System.out.println(ptr);
        else
        System.out.println((int)ptr);
    }
}
