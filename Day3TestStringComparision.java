public class Day3TestStringComparision {
    public static void main(String[] args)
    {
        String s1="Sachin";
        String s2="Sachin";
        String s3=new String("SAchin");
        String s4="Saurav";
		// by using equals() and equalsIgnoreCase() __Check__by__Content__
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//false
        System.out.println(s1.equalsIgnoreCase(s3));//true 
        System.out.println(s1.equals(s4));//false
    }
}
