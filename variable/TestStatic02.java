class TestStatic02{
	static int x;  //x=0
	static{
		System.out.println("X " + x);
		x=88;
		System.out.println("Static block is loaded x initialized! " + x);
	}
	static int y; //y=0
	static{
		y=55;
		System.out.println("Static block is loaded y initialized! " + y);
	}

	static int z=90;


	public static void main(String args[]){
		System.out.println("main Start");
		System.out.println("Z : "+TestStatic02.z);
	}
	
	static int f;
	static{
		f=33;
		System.out.println("Static block is loaded f initialized! " + f);
	}
	static int r;
	static{
		r=22;
		System.out.println("Static block is loaded r initialized! " + r);
	}

	
}