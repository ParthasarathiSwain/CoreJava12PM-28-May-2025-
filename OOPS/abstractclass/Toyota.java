class Toyota extends Car{
	@Override
	public  void speed(){
		System.out.println("Toyota Speed 100 kmph");
	}
	public  void engine(){
		System.out.println("Toyota engine");
	}

}
class Innova extends Car{
	@Override
	public  void speed(){
		System.out.println("Innova Speed 400 kmph");
	}
	public  void engine(){
		System.out.println("Innova engine");
	}

}
class Audi extends Car{
	@Override
	public  void speed(){
		System.out.println("Audi 500 kmph");
	}
	public  void engine(){
		System.out.println("Audi engine");
	}

}