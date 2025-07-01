class Parent{
	public void eat(){
		System.out.println("Rice ,Dal And Boiled Egg");
	}
	public void add(int x,int y){
		System.out.println("addition is :"+(x+y));
	}

}

class Child extends Parent{
	@Override
	public void eat(){
		System.out.println("Maggie");
	}
	public static void main(String args[]){
		Child c=new Child();
		c.eat();
	}

}