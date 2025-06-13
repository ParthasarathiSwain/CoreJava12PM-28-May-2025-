package Array;


public class TestJaggedArray {
	public static void main(String[] args) {
		int x[][]=new int[][] {
								{10,20,30},
								{11,22,33,44},
								{23,45}
							  };
			for (int row = 0; row < x.length; row++) {
				for (int col = 0; col < x[row].length; col++) {
					System.out.println("x["+row+"]["+col+"] : "+x[row][col]);
				}
				System.out.println();
			}
					System.out.println();
					System.out.println("--------------");
							  
		int m[][]= {
						{10,20,30,40},
						{11,22,33},
						{23,32}
				   };
		
		for (int row = 0; row < m.length; row++) {
			for (int col = 0; col < m[row].length; col++) {
				System.out.println("m["+row+"]["+col+"] : "+m[row][col]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("--------------");
		
		int marks[][]=new int[3][];
		marks[0]=new int[4];
		marks[0][0]=10;
		marks[0][1]=20;
		marks[0][2]=30;
		marks[0][3]=40;
		
		
		marks[1]=new int[3];
		marks[1][0]=11;
		marks[1][1]=22;
		marks[1][2]=22;
		
		marks[2]=new int[2];
		marks[2][0]=12;
		marks[2][1]=21;
		int student=1;
		for (int row = 0; row < marks.length; row++) {
			System.out.println("Student-"+student);
			student++;
			for (int col = 0; col < marks[row].length; col++) {
				System.out.println("marks["+row+"]["+col+"] : "+marks[row][col]);
			}
			System.out.println();
		}
	}
}
