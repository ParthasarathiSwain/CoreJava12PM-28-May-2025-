class Animal{
	private String name;
	private int age;

	//Getter&Setter
	
	public void setName(String name){
		if(Character.isDigit(name.charAt(0))){
			System.out.println("invalid name");
		}else{
			this.name=name;
		}

	}

	public String getName(){
		return this.name;
	}

	public void setAge(int age){
		if(age>0){
			this.age=age;
		}else{
			System.out.println("invalid age");
		}
	}

	public int getAge(){
		return this.age;
	}

	
}