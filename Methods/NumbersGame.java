package Methods;

import java.util.Scanner;

public class NumbersGame {
	
	public static void getSqaure(int num) {
		System.out.println("Square is : "+(num*num));
	}
	
	
	public void getCube(int num) {
		System.out.println("Cube is : "+(num*num*num));
	}
	
	
	public void checkPosNev(int num) {
		if (num>0) {
			System.out.println(num +"  is +Ve!");
		} else {
			System.out.println(num +"  is -Ve!");
		}
	}
	
	public void checkEvenOrOdd(int num) {
		if (num%2==0) {
			System.out.println(num +"  is Even!");
		} else {
			System.out.println(num +"  is Odd!");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);


		while (true) {
			System.out.println("1-Square");
			System.out.println("2-Cube");
			System.out.println("3-Check Even or Odd");
			System.out.println("4-check +ve or -ve");
			System.out.println("5-Stop");

			System.out.println("Enter a Choice : ");
			int choice=sc.nextInt();
			sc.nextLine();
			NumbersGame obj=new NumbersGame();
			int num;
			switch (choice) {
			case 1: {
					System.out.println("Enter number : ");
					num=sc.nextInt();
					NumbersGame.getSqaure(num);
					break;
			}
			case 2: {
					System.out.println("Enter number : ");
					num=sc.nextInt();
					obj.getCube(num); 
					break;
			}
			case 3: {
					System.out.println("Enter number : ");
					num=sc.nextInt();
					obj.checkEvenOrOdd(num);
					break;
			}
			case 4: {
				System.out.println("Enter number : ");
				num=sc.nextInt();
				obj.checkPosNev(num);
				break;
			}
			case 5: {
				break;
			}
			default:
				System.out.println("Invalid Choice Please Enter 1-5 !");
			}
		}
	}
}
