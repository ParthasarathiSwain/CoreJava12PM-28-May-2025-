class Tiger{
	static final String JUNGLE_NAME;
	static{
		JUNGLE_NAME="NandanKanan";
		System.out.println("Static block");
	}

	String name;
	double height;
	double weight;
	int age;
	/*{
		name="raja";
		System.out.println("Non-Static block");
	}*/
	Tiger(){
		System.out.println("cons block");
	}
	Tiger(String name,double height,double weight,int age){
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.age=age;
		System.out.println("param-cons block");
	}
	public static void main(String args[]){
		System.out.println("Main Start");

		Tiger t1=new Tiger("raja",3.4,30.0,22);
		System.out.println("name : "+t1.name);
		System.out.println("height : "+t1.height);
		System.out.println("weight : "+t1.weight);
		System.out.println("age : "+t1.age);
		System.out.println("----------------");

		Tiger t2=new Tiger();
		System.out.println("name : "+t2.name);
		System.out.println("height : "+t2.height);
		System.out.println("weight : "+t2.weight);
		System.out.println("age : "+t2.age);
		System.out.println("----------------");

		Tiger t3=new Tiger();
		t3.name="ramahari";
		t3.height=7.8;
		t3.weight=340.9;
		t3.age=16;
		System.out.println("name : "+t3.name);
		System.out.println("height : "+t3.height);
		System.out.println("weight : "+t3.weight);
		System.out.println("age : "+t3.age);
		System.out.println("----------------");

		Tiger t4=new Tiger();
		t4.name=t4.getName();
		System.out.println("name : "+t4.name);
		System.out.println("height : "+t4.height);
		System.out.println("weight : "+t4.weight);
		System.out.println("age : "+t4.age);
		System.out.println("----------------");

		Tiger t5=new Tiger();
		System.out.println("----------------");

		System.out.println("Main end");
	}
	String getName(){
	  return "Sabitri";
	}
}















