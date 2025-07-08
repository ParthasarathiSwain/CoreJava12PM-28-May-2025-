package StringHandling;

public class Test02 {
	public static void main(String[] args) {
		String s1="hy";
		String s2="hy";
//		System.out.println(s1==s2);//true //== operator always checks addresses in String
		System.out.println(s1.equals(s2)); //true
		
		String s3=new String();
//		System.out.println(s1==s3); //false
		
		String s4=new String("hy");
//		System.out.println(s1==s4);// false
		String s5=new String("hy");
//		System.out.println(s4==s5);
		
		String s6=new String("bye");
//		System.out.println(s4==s6); //false
		
		
		int x=90;
		int y=90;
//		System.out.println(x==y);//== operator always checks values in primitive data type
		
		
		String s7="ram";
		String s8="ram";
//		System.out.println(s7==s8); //true
		
		String s9="hari";
//		System.out.println(s8==s9); //false
		
		String s10=new String("hari");
//		System.out.println(s10.equals(s9));//true
		//equals method first check addresses then it will check values
		//if addresses matched then it will return true
		//if not matched then it will check value present inside these addresses
		//if values matched then it will return true otherwise it will return false
//		System.out.println(s10.equals("hari"));//true
	}
}
