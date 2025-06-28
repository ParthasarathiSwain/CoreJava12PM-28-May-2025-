class Dog{
	String petName;
	int age;

	Dog(){
	
	}
	Dog(String petName){
		this.petName=petName;
	}
	Dog(String petName,int age){
		
		this.petName=petName;
		this.age=age;
	}
	public static void main(String args[]){
           	Dog d1=new Dog("Hunter",4);
		System.out.println(d1.petName +" , "+d1.age);

		Dog d2=new Dog("Kall",6);
		System.out.println(d2.petName +" , "+d2.age);
		
		//Dog d3=new Dog("Kall",6,90,78);

	
   	}

}




