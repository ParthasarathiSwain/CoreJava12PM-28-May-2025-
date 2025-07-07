interface Land{
	public void eat();
	public void dance();
}
interface Water{
	public void eat();
}
class Home{
	public void eat(){}
}

class Snake extends Home implements Land,Water{
	@Override
	public void eat(){
	  System.out.println("Land");
	}
	@Override
	public void dance(){
	  System.out.println("Dance");
	}
	public void fly(){
	  System.out.println("Sky");
	}
	public static void main(String args[]){
	   Snake s=new Snake();
	   s.eat();
	}
}