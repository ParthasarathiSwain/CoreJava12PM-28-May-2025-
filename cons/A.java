 class A{
   
   A(){
	System.out.println("No param Cons");
   }

   A(int x){
	System.out.println(" param Cons");
   }

   public static void main(String args[]){
    
        A obj=new A();	A obj2=new A(34);

   }
}