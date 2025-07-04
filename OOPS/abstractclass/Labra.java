abstract class Animal{
	abstract void sleep();
}
abstract class Dog extends Animal{
	abstract void bark();
	abstract void run();
}
class Labra extends Dog{
	@Override
	public  void sleep(){
		System.out.println("Dog is sleeping... ");
	}

	@Override
	public  void bark(){
		System.out.println("Dog is Barking Bho Bho ");
	}
	@Override
	public  void run(){
		System.out.println("Dog is runng with speed 30 kmph");
	}
	
	public static void main(String args[]){
		Labra l1=new Labra();
		l1.sleep();
		l1.bark();
		l1.run();
	}
}