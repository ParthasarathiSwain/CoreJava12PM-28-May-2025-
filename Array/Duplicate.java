class Duplicate{
	public static void main(String args[]){
		int x[]={12,23,12,33,23};
		for (int i=0;i<x.length ;i++){
      			for(int j=i+1 ;j<x.length;j++){
           		   if(x[i]==x[j]){
               			 System.out.println(x[j]);
                		  break;
              		   }
      			}
		}
	}
}