package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter number 1 : ");
			int n1=sc.nextInt();
			System.out.println("Enter number 2 : ");
			int n2=sc.nextInt();
			System.out.println(n1 + "  : "+n2);
			
			int res=n1/n2;
			System.out.println("Res : "+res);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		
	}
}
