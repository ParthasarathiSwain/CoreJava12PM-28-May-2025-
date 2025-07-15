import java.io.*;
class Test04{
	public static void main(String args[]) throws IOException{
		FileWriter fw=new FileWriter("iti.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hyyy");
		bw.newLine();
		bw.write("ITI");
		
		bw.flush();
		bw.close();
	}	
}