import java.util.Scanner;
class RemAnyIndex{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array :");
		int size=sc.nextInt();
		//array declaration
		int x[]=new int[size];
		//array initializing
		for(int i=0;i<x.length;i++){
			System.out.println("Enter value of x["+i+"] : ");
			x[i]=sc.nextInt();
		}

		//Printing Before removing
		for (int i=0;i<x.length ;i++){
      			System.out.println("x["+i+"] = "+x[i]);
		}
		System.out.println("Enter Remove index number :");
		int remi=sc.nextInt();
		if(remi<x.length){
			for (int i=remi;i<x.length-1 ;i++){
      				x[i]=x[i+1];
			}
			x[x.length-1]=0;

			System.out.println();
			System.out.println("------------------------");
			//Printing after removing
			for (int i=0;i<x.length ;i++){
      				System.out.println("x["+i+"] = "+x[i]);
			}
		}else{
			System.out.println("Please Enter Remove index number 0 to "+(size-1));
		}
		
		

	}
}