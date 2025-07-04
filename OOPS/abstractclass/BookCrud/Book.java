class Book{
	private int id;
	private String name;
	private String author;
	private double price;
	
	//Setter & Getter 
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public String getAuthor(){
		return this.author;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return this.price;
	}
}