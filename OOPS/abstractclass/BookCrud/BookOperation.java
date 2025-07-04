import java.util.Scanner;
class BookOperation extends BookOP{
	Scanner sc=new Scanner(System.in);
	private Book[] books=new Book[100];
	private int count=0;

	@Override
	public void addBook(){
		System.out.println("Enter Book Id     : ");
		int newId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Book Name   : ");
		String newName=sc.nextLine();
		System.out.println("Enter Book Author : ");
		String newAuthor=sc.nextLine();
		System.out.println("Enter Book Price  : ");
		double newPrice=sc.nextDouble();
		
		if(count>=books.length){
			System.out.println("Storage Is Full!");
		}else{
			Book book=new Book();
			book.setId(newId);
			book.setName(newName);
			book.setAuthor(newAuthor);
			book.setPrice(newPrice);
		
			books[count]=book;
			count++;
			System.out.println("Book Added Successfully!");
		}
	}
	@Override
	public void viewBook(){
		if(count<=0){
			System.out.println("No Books Available!");
		}else{
			System.out.println("-----All Books-----");
			for(int i=0;i<count;i++){
				System.out.println("Book "+(i+1));
				System.out.println("Book Id    : "+books[i].getId());
				System.out.println("Book name  : "+books[i].getName());
				System.out.println("Book author: "+books[i].getAuthor());
				System.out.println("Book price : "+books[i].getPrice());
				System.out.println();
			}
		}
	}
	@Override
	public void updateBook(int updateId){
		boolean b=false;
		for(int i=0;i<count;i++){
			if(books[i].getId()==updateId){
				System.out.println("Enter Book Name   : ");
				String newName=sc.nextLine();
				sc.nextLine();
				System.out.println("Enter Book Author : ");
				String newAuthor=sc.nextLine();
				
				System.out.println("Enter Book Price  : ");
				double newPrice=sc.nextDouble();
				books[i].setName(newName);
				books[i].setAuthor(newAuthor);
				books[i].setPrice(newPrice);
				b=true;
				System.out.println("Book Updated Successfully!");
			}		
		}
		if(!b){
			System.out.println("Book Id Not Found!");
		}
		
	}


}













