import java.io.*;
class Test06{
	public static void main(String args[])throws IOException{
             //FileReader fr=new FileReader("Lohit.txt"); 
	     PrintWriter pw=new PrintWriter("iti.txt");
	     BufferedReader br=new BufferedReader(new FileReader("Lohit.txt"));
	     String line= br.readLine();
	     while(line!=null){
		//System.out.println(line);
		
		pw.println(line);
		
		line=br.readLine();
	     }
	     pw.flush();
	     br.close();
             pw.close();
	}

}