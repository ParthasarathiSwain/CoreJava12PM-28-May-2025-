import java.util.Scanner;
class TwoDArray{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter row size :");
		int rsize=sc.nextInt();
		System.out.println("Enter Col size :");
		int csize=sc.nextInt();

		//Declaration
		int[][] x=new int[rsize][csize];

		//initalization	
		for(int row=0; row<rsize ;row++){
			for(int col=0 ; col<csize ;col++){
				System.out.println("Enter value of x["+row+"]["+col+"] : ");
				x[row][col]=sc.nextInt();
			}
		}

		//printing
		for(int row=0; row<rsize ;row++){
			for(int col=0 ; col<csize ;col++){
				System.out.println("x["+row+"]["+col+"] : "+x[row][col]);
			}
		}

	}
}









/*
		int x[][]={
				{10,20},
				{30,40}
			  };
		System.out.println(x[0][0]);
		System.out.println(x[0][1]);
		System.out.println(x[1][0]);
		System.out.println(x[1][1]);
*/