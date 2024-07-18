class Narrowing
{
	public static void main(String[] args) 
	{
		{
		double d=120.45987890;
		float f=(float)d;
		long l=(long)d;
		int i=(int)d;
		char ch=(char)d;
		short s=(short)d;
		byte b=(byte)d;
			    System.out.println("");
				System.out.println("-------------double narrowing-------------");
		        System.out.println(f);
				System.out.println(l);
				System.out.println(i);
				System.out.println(ch+" (as i take double number as a charecter)");
				System.out.println(s);
				System.out.println(b);
				System.out.println("------------double narrowing end------------");
				System.out.println("");
				}
		
		{
		float f=120.97f;
		long l=(long)f;
		int i=(int)f;
		char ch=(char)f;
		short s=(short)f;
		byte b=(byte)f;
			    System.out.println("");
				System.out.println("-------------Float narrowing-------------");
		        System.out.println(f);
				System.out.println(l);
				System.out.println(i);
				System.out.println(ch+" (as i take float number as a charecter)");
				System.out.println(s);
				System.out.println(b);
				System.out.println("------------Float narrowing end------------");
				System.out.println("");
				}
		{
			
		long l=120;
		int i=(int)l;
		char ch=(char)l;
		short s=(short)l;
		byte b=(byte)l;
			    System.out.println("");
				System.out.println("-------------long narrowing-------------");
				System.out.println(l);
				System.out.println(i);
				System.out.println(ch+" (as i take long number as a charecter)");
				System.out.println(s);
				System.out.println(b);
				System.out.println("------------long narrowing end------------");
				System.out.println("");
			
		}
		
		{
			

		int i=120;
		char ch=(char)i;
		short s=(short)i;
		byte b=(byte)i;
			    System.out.println("");
				System.out.println("-------------int narrowing-------------");
				System.out.println(i);
				System.out.println(ch+" (as i take int number as a charecter)");
				System.out.println(s);
				System.out.println(b);
				System.out.println("------------int narrowing end------------");
				System.out.println("");
			
		}
	{
			
		char ch='x';
		short s=(short)ch;
		byte b=(byte)ch;
			    System.out.println("");
				System.out.println("-------------char narrowing-------------");
				System.out.println(ch+" (as i take char number as a charecter)");
				System.out.println(s);
				System.out.println(b);
				System.out.println("------------char narrowing end------------");
				System.out.println("");
			
		}
		{
			
		short s=120;
		byte b=(byte)s;
			    System.out.println("");
				System.out.println("-------------short narrowing-------------");
				System.out.println(s);
				System.out.println(b);
				System.out.println("------------short narrowing end------------");
				System.out.println("");
			
		}
		
		{
		byte b=(byte)128;
			    System.out.println("");
				System.out.println("-------------char narrowing-------------");
				System.out.println(b);
				System.out.println("if im taking 128 input it will give me -128 putput because of cycle of byte to byte");
				System.out.println("------------char narrowing end------------");
				System.out.println("");
			
		}
				
	}
}
