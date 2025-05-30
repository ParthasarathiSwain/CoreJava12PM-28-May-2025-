class Test02{
	static byte b=127;
	static short s=787;
	static int i=999;
	static long l=1717l;
	static boolean bol=true;
	static char ch='9';
	static float f=89.00f;
	static double d=99.777;
	               //  0  1  2  3
	static int arr[]={23,34,56,66};	
	static Test02 obj=new Test02();

	public static void main(String args[]){
	//	int y=90;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(bol);
		System.out.println(ch); 			
		System.out.println(f);
		System.out.println(d);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(obj); //className@hexadecimal code

	}
}