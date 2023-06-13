class CommandLineExample04
{
  public static void main(String abc[])
  {
    int sum=0;
	for(String i:abc)
	sum+=Integer.parseInt(i);
	System.out.println(sum);
  }
}