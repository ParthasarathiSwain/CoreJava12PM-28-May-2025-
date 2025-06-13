package Array;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] x=new int[3][];
		x[0]=new int[3];
		System.out.println("x[0][0] : ");
		x[0][0]=sc.nextInt();
		System.out.println("x[0][1] : ");
		x[0][1]=sc.nextInt();
		System.out.println("x[0][2] : ");
		x[0][2]=sc.nextInt();
		
		x[1]=new int[4];
		System.out.println("x[1][0] : ");
		x[1][0]=sc.nextInt();
		System.out.println("x[1][1] : ");
		x[1][1]=sc.nextInt();
		System.out.println("x[1][2] : ");
		x[1][2]=sc.nextInt();
		System.out.println("x[1][3] : ");
		x[1][3]=sc.nextInt();
		
		x[2]=new int[2];
		System.out.println("x[2][0] : ");
		x[2][0]=sc.nextInt();
		System.out.println("x[2][1] : ");
		x[2][1]=sc.nextInt();
		
		
		System.out.println("-----------------");
		
		
		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[row].length; col++) {
				System.out.println("x["+row+"]["+col+"] : "+x[row][col]);
			}
			System.out.println();
		}
		
	}
}
