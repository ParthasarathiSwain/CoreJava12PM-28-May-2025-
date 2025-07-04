class TestDrive{
	public static void main(String args[]){
		Toyota t1=new Toyota();
		t1.speed();
		t1.engine();
	/*	Innova i1=new Innova();
		i1.speed();
		Audi a1=new Audi();
		a1.speed();
	*/
		Car c=new Toyota();
		c.speed();
	//	c.engine(); //error: cannot find symbol

		c=new Innova();
		c.speed();

		c=new Audi();
		c.speed();

	}
}