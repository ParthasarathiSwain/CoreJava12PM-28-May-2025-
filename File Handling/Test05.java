import java.io.*;
class Test05{
	public static void main(String args[]) throws IOException{
		PrintWriter pw=new PrintWriter("iti.txt");
		pw.println("Hy How are you");//write()+newLine()
		pw.println("Welcome");

		pw.print("to OTZ");

		pw.printf("hyyyyyyyyy",new Object());

		pw.flush();
		pw.close();
	}	
}