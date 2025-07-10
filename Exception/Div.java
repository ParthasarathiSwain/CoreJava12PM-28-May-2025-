
class Div{
	public static void main(String args[]){
		try{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);

			try{
				int c=a/b;
				System.out.println("C : "+c);
			}catch(ArithmeticException ae){
				System.out.println("Don't enter sec value as zero!");
			}
			
		}catch(ArrayIndexOutOfBoundsException ae){

			ae.printStackTrace();

			System.out.println("Please enter two value!");
		}catch(NumberFormatException nfe){
			System.out.println("Please two Numeric value!");
		}
		
		

		
	}
}