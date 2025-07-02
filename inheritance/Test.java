class A{
	private int h=889000;
	static int k;
	static{
		k=88;
		System.out.println("A class static block k ");
	}
	int x=190;
	A(){
		super();
		System.out.println("A class Cons ");
	}
  	
	void m(){
		System.out.println("A class m() ");
	}
}
class B extends A{
	static int t;
	static{
		t=8855;
		System.out.println("B class static block t ");
	}

	B(){
		super();
		System.out.println("B class Cons ");
	}

	int y=60;
	@Override
	void m(){
		System.out.println("B class m() ");
	}
	
}
class C extends B{
	static int w;
	static{
		w=33;
		System.out.println("C class static block w ");
	}

	C(){
		super();
		System.out.println("C class Cons ");
	}

	int p=20;
	@Override
	void m(){
		System.out.println("C class m() ");
	}

}
class D extends C{
	static int k=777;
	static{
		k=777;
		System.out.println("D class static block k ");
	}

	int x=90;
	int z=10;
	D(){
		super();
		System.out.println("D class Cons ");
		System.out.println(x);
		System.out.println(super.x);
	}
	@Override
	void m(){
		System.out.println("D class m() ");
	}

}

class Test{
	public static void main(String args[]){
	/*	A a=new A();
	//	System.out.println("A class x "+a.x);
	//	System.out.println("B class y "+a.y);//error: cannot find symbol

		B b=new B();
		System.out.println("A class x "+b.x);
		System.out.println("B class y "+b.y);
		b.m();

		D d=new D();
		System.out.println("A class x "+d.x);
		System.out.println("B class y "+d.y);
		System.out.println("C class p "+d.p);
		System.out.println("D class z "+d.z);
	
		D d1=new D();
	//	System.out.println("D class z "+d1.z);

	
		System.out.println("A class "+A.k);
		System.out.println("D class "+D.k);
		
*/
		D d1=new D();

		System.out.println("A class "+d1.h);
	}
}