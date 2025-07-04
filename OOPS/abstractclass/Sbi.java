class Sbi extends Bank{
	@Override
	public  void deposite(double amount){
		System.out.println("Sbi deposite "+amount);
	}
	@Override
	public  void withdraw(double amount){
		System.out.println("Sbi withdraw "+amount);
	}
	public static void main(String args[]){
		//Bank obj=new Bank();//error: Bank is abstract; cannot be instantiated

		Sbi acc1=new Sbi();
		acc1.deposite(1200.00);
		acc1.withdraw(300.00);

		Bank acc2=new Sbi();
		acc2.deposite(3300.00);
		acc2.withdraw(500.00);


	}

}