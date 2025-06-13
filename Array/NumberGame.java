package NumberGame;

import java.util.Scanner;

public class NumberGame {
	static int x[]=new int[10];
	static Scanner sc=new Scanner(System.in);
	static int count=0;
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("1-AddNumber\n2-ViewAll\n3-square");
			System.out.println("Press a Number : ");
			int choice=sc.nextInt();
			switch (choice) {
			
				case 1: {
					add();
					break;
				}
				case 2: {
					view();
					break;
				}
				case 3: {
					square();
					break;
					}
			default:
				System.out.println("Invalid Choice !");
			}
		}
	}
	
	
	//add number 
	static void add() {
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		if (count>=10) {
			System.out.println("Array is full!");
		} else {
			x[count]=num;
			count++;
			System.out.println("Number added Successfully");
		}
	}
	//view number
	static void view() {
		for (int i = 0; i < count; i++) {
			System.out.println("x["+i+"] = "+x[i]);
		}
	}
	//square
	static void square() {
		for (int i = 0; i < count; i++) {
			System.out.println(x[i]+" Square = "+(x[i]*x[i]));
		}
	}
}
