import java.util.Scanner;
class BookApplication{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		BookOperation bo=new BookOperation();
		while(true){
			System.out.println("1-Add Book\n2-View Book\n3-Update Book\n4-Delete Book\n5-exit");
			System.out.println("Enter Choice : ");
			int choice=sc.nextInt();
			sc.nextLine();
		
			switch(choice){
				case 1:{
					bo.addBook();
					break;	
				}
				case 2:{
					bo.viewBook();
					break;	
				}
				case 3:{
					System.out.println("Enter Book Id for Update :");
					int updateId=sc.nextInt();
					bo.updateBook(updateId);
					break;	
				}
				case 4:{
					break;	
				}
				case 5:{
					break;	
				}
				default :{

				}
			}
		}
	}
}