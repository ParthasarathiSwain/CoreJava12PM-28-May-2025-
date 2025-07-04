//public abstract class Test01{ //allow
//private abstract class Test01{   CE: modifier private not allowed here
//protected abstract class Test01{ CE: modifier protected not allowed here
//final abstract class Test01{     CE: illegal combination of modifiers: abstract and final

 abstract class Test01{
	public static int x=90;
	private static int r=190;
	protected static int e=290;
	static int w=490;
	static{}
	public static void xyz1(){}
	private static void xyz2(){}
	protected static void xyz3(){}
	static void xyz4(){}

	
	public  int s1=90;
	private  int s2=190;
	protected  int s3=290;
	int s4=490;
	{}
	Test01(){

	}
	public  void ww1(){}
	private  void ww2(){}
	protected  void ww3(){}
	void ww4(){}

	
	public abstract void m1(); //allow
	protected abstract void m3();//allow

//	static abstract void m2();// CE: illegal combination of modifiers: abstract and static
//	privet abstract void m4();// CE: illegal combination of modifiers: abstract and privet
//	final abstract void m4();// CE: illegal combination of modifiers: abstract and final

	//main //allow
}