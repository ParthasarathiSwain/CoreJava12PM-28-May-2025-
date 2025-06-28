class Animal{
	int x=90;
	Animal(){
		System.out.println("No Param Cons Animal");
	}
}

class Tiger extends Animal{
	Tiger(){
		super();
		System.out.println("No Param Cons Tiger"+ super.x);
	}
	public static void main(String args[]){
		Tiger t1=new Tiger(); 
		//super();//call to super must be first statement in constructor
	}
	
}