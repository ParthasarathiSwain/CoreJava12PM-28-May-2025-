@FunctionalInterface
interface Vehicle{
   public void start(int x);
}

class Car{
	public static void main(String args[]){
		Vehicle c1=(a)->{
			System.out.println("Car is started! "+a);
		};
		c1.start(30);
	}
}