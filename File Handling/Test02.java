import java.io.*;
class Test02{
	public static void main(String args[]) throws IOException{
		FileWriter fw=new FileWriter("iti.txt");

		fw.write("hello\n");
		fw.write('T');
		fw.write(97);
		char[] ch={'a','b'};
		fw.write(ch);

		fw.flush();
		fw.close();

		FileWriter fw2=new FileWriter("iti.txt");
		fw2.write("Bye\n");
		fw2.flush();
		fw2.close();
	}	
}