class Test03{
	
	public static void main(String args[]){
		int x=90;
		int y=10;
		int z=x+y;
		System.out.println(z);
		
		byte b1=10;
		byte b2=20;
	//	int b3=b1+b2;
	/*	      (byte)+(byte)
			\	/
			 \     /
			  (int)
	*/
		byte b3=(byte)(b1+b2);
 		System.out.println(b3);
		
		System.out.println("----------------------------");

 		byte b4=90;
		short s1=b4; //widening
		System.out.println(s1);
		System.out.println("----------------------------");


		short s2=100; 
		byte b5=(byte)s2;
		
		System.out.println(b5);

		byte b6=49;
		byte b7=51;
	//	byte b8=(byte)b6+b7;
	//	byte b8=(byte)b6+(byte)b7;
		byte b8=(byte)(b6+b7);
		System.out.println(b8);

	}
}








