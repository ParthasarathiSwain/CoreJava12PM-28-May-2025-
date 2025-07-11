package Exception;

import java.util.Scanner;

public class TestEx {
	
	static void check(int a) throws  ItishreeException{
		if(a<10) {
			throw new ItishreeException("Number is Small");
		}else {
			System.out.println("Number is Greater!");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int a=sc.nextInt();
		try {
			check(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
