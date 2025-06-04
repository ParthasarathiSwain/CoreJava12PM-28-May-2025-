import java.util.Scanner;
class  Array02{
	public static void main(String jj[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size : ");
		int size=sc.nextInt();

		int x[]=new int[size];
		
		for(int index=0;index<size;index++){
			System.out.println("Enter Value of Index "+index+" : ");
			x[index]=sc.nextInt();
		}
		
		System.out.println("----------------------------");

		for(int index=0 ;index<x.length;index++){
			System.out.println("x["+index+"] : "+x[index]);
		}

		System.out.println("----------------------------");
		int sum=0;
		for(int index=0 ;index<x.length;index++){
			sum+=x[index];
		}
		
		System.out.println("Sum is : "+sum);

		System.out.println("----------------------------");
		int count=0;
		
		for(int index=0 ;index < x.length ; index++){
			int i=2;
			boolean flag=false; 
			while(i*i <= x[index]){
				if(x[index]%i==0){
					flag=true;
					break;
				}
				i++;
			}
			if(!flag){
				count++;
			}
		}
		System.out.println("Total Prime Numbers is : "+count);
	}
}