class TestStatic{
	static int x=90;//direct init   dec+init

	static int y;
	static{
		y=88; //through static block
	}
	
	static int z=m(); //method call
	
	static int d=190;
	static int e=d;//old variable

	public static void main(String args[]){
		System.out.println("x : "+x);
		System.out.println(TestStatic.x);
		System.out.println(TestStatic.y);
		System.out.println(TestStatic.z);
		System.out.println(TestStatic.d);
		System.out.println(TestStatic.e);

	}

	static int m(){
          return 20;
        }

}