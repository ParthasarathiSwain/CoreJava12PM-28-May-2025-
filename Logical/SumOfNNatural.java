import java.util.Scanner;
class SumOfNNatural{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=num){
			sum+=i;
			i++;
		}
		System.out.println("Sum is : "+sum);
	}
}