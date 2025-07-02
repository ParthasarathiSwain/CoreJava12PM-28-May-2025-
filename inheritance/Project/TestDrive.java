class Car{
	
	public void start(){
	  	System.out.println("Car is starting....");
	  	run();
	}
	public void run(){
		System.out.println("Car is Running....");
	}

}
class BMW extends Car{
	 Engine e;
	 BMW(Engine e){
		this.e=e;
		e.engStart();		
	 }
	
}
class AUDI extends Car{
	
}

class Engine{
	private Petrol petrol;
	
	Engine(Petrol petrol){
		this.petrol=petrol;
		petrol.fill();
	}
	void engStart(){
		System.out.println("Engine Start");
	}
}
class Petrol{
	int capacity;
	void fill(){
		System.out.println("Petrol Fill");
	}
}


class TestDrive{
	public static void main(String args[]){
		Petrol p=new Petrol();
		p.capacity=9;

		Engine e=new Engine(p);
		
		BMW b=new BMW(e);
		b.start();
	}
}
