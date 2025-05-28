import java.util.Scanner;
class CheckPrimeNaive{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		int i=2;
		boolean b=false;

		while(i*i<num){
   		    if(num%i==0){
             		 b=true;
        	    }
		  i++;
		}

		if(b==true){
          		System.out.println("Not Prime");
		}else{
     			System.out.println("Prime");S
		}

	}
}