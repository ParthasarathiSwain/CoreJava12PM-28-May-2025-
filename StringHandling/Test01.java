package StringHandling;

public class Test01 {
	public static void main(String[] args) {
		/*
		 	The String class represents character strings. Allstring literals in Java programs, such as "abc", are implemented as instances of this class. 

			Strings are constant; their values cannot be changed after they are created. String buffers support mutable strings.Because String objects are immutable they can be shared. For example: 

     		String str = "abc";
		 */
		String s=null; //null default value
		String s1="abc"; //String literal
		String s2=new String("Hello");
		String s3=new String("Hello");
		
		
		String s4=new String();
		String s5=new String("GGG");
		String s6=new String(new StringBuffer());
		String s7=new String(new StringBuilder());
	}
}
