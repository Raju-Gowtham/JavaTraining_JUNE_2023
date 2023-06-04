public class Day3TestStringComparision2 {
    public static void main(String[] args)
    {
        String s1="Sachin";
        String s2="Sachin";
        String s3=new String("Sachin");
         // using == operator   __check__by__reference__
        System.out.println(s1==s2));//true
        System.out.println(s1==s3);//false

    }
}
