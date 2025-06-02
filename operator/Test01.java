class  Test01{
	public static void main(String args[]){
		int x=90;
		int y=80;
		int r1=x+y; //addition
		int r2=x*y; //multiplecation
		int r3=x/y; //Division
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);

		

		System.out.println("Hy"+"Bye");
	//	System.out.println("Hy"-"Bye");// bad operand types for binary operator
	//	System.out.println("Hy"/"Bye");// bad operand types for binary operator
	//	System.out.println("Hy"*"Bye");// bad operand types for binary operator


		String s1="Java";
		System.out.println(s1+"Language");//JavaLanguage
		System.out.println(s1+"     Language");	//Java     Language
		System.out.println(10+20+"Language");   //30Language
		System.out.println("90"+10+20+"2025");  //9010202025
		System.out.println(90+10+"20"+"2025"+(20+7)); //10020202527
		System.out.println("X : "+40);

		int p1=20;
		int p2=5;
		System.out.println("res : "+(p1/p2));// res : 4
	//	System.out.println("res : "+(p1/0)); // ArithmeticException
		System.out.println("res : "+(10.0f/0));//Infinity
		System.out.println("res : "+(-10.0f/0));//-Infinity
	//	System.out.println("res : "+(0/0));//ArithmeticException
		System.out.println("res : "+(0.0/0));//NAN-Not a Number

		
	}
}








