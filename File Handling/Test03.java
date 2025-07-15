import java.io.*;
class Test03{
	public static void main(String args[])throws IOException{
             FileReader fr=new FileReader("Lohit.txt"); 
	     int data=fr.read();
	     System.out.println("Data : "+(char)data);
	}

}