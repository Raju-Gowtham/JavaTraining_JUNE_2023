// java program for string concatination using concat()
public class Day3ConcatExample3{
    public static void main(String[] args)
    {
        String s1="Hello";
        String s2="Java";
        String s3="Reader";
		// concating space among the strings
        String s4=s1.concat(" ").concat(s2).concat(" ").concat(s3);
        System.out.println(s4);
		//concatinating special chars
        String s5=s1.concat("!!!");
		System.out.println(s5);
		String s6=s1.concat("@").concat(s2);
		System.out.println(s6);
    }
}
