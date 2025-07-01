class P1{
   int x=90;
}


class C1 extends P1{
   int y=88;
   public static void main(String args[]){
	C1 o=new C1();
	//System.out.println(o.x);
	P1 p=new P1();
       // System.out.println(p.y);
		
	
	P1 op=new C1();
	//System.out.println(op.y);
	System.out.println(op.x);

      //  C1 cc=new P1();
   }
}

