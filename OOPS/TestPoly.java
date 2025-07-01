class TestPoly{
	static void add(){
		System.out.println("0 Param");
	}
	static void add(int x,int y){
		System.out.println("2 Param");
	}
	static void add(int x,int y,int z){
		System.out.println("3 Param");
	}
	static void add(int x,int y,int z,int q){
		System.out.println("4 Param");
	}

	public static void main(String args[]){
		add(12,13,78);
	}
}