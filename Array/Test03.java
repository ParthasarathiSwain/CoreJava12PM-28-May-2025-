package Array;

import java.util.Iterator;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size : ");
		int rows=sc.nextInt();
		int[][] x=new int[rows][];
		//declaration
		for (int i = 0; i < x.length; i++) {
			System.out.println("Enter Col size of row "+(i+1));
			int cols=sc.nextInt();
			x[i]=new int[cols];
		}
		
		
		
		System.out.println("-----------------");
		
		//initialization
		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[row].length; col++) {
				System.out.println("Enter value of x["+row+"]["+col+"] : ");
				x[row][col]=sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		//printing
		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[row].length; col++) {
				System.out.println("x["+row+"]["+col+"] : "+x[row][col]);
			}
			System.out.println();
		}
	}
}
