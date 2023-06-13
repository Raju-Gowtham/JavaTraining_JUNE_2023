// java program to convert all primitives into its corresponding 
// wrapper objects and vice-versa
//wrapper class by default included
class WrapperExample02{
   public static void main(String[] args)
   {
     byte b=10;
	 short s=20;
	 int i=30;
	 long l=40;
	 float f=50.0F;
	 double d=60.0D;
	 char c='a';
	 boolean b2=true;
	 // autoboxing :converting primitives to objects
	 Byte byteobj=b;
	 Short shortobj=s;
	 Long longobj =l;
	 Float floatobj=f;
	 Double doubleobj =d;
	 Character charobj =c;
	 Boolean booleanobj= b2;
	 System.out.println("-----Objects----- : ");
	 System.out.println(byteobj+" "+shortobj+" "+longobj+" "+floatobj+" "+charobj+" "+doubleobj+" "+booleanobj);
	 // Unboxing :converting objects to premitives
	 byte Byteobj=byteobj;
	 short Shortobj=shortobj;
	 long Longobj =longobj;
	 float Floatobj=floatobj;
	 double Doubleobj =doubleobj;
	 char Charobj =charobj;
	 boolean Booleanobj= booleanobj;
	 System.out.println("\n-----Premitives----- : ");
	 System.out.println(Byteobj+" "+Shortobj+" "+Longobj+" "+Floatobj+" "+Doubleobj+" "+Charobj+" "+Booleanobj);
   }
}