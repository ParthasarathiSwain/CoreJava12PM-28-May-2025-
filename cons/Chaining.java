class Chaining{
	Chaining(){
		this(10);
		System.out.println("No Param Cons");
	}
	Chaining(int x){
		this("Hy",66);
		System.out.println("one Param Cons");
	}
	Chaining(String y,int z){
		this("Byey",69,'K');
		System.out.println("Two Param Cons");
	}
	Chaining(String y,int z,char s){
		System.out.println("Three Param Cons");
	}
	public static void main(String args[]){
		Chaining obj=new Chaining();
	}
}