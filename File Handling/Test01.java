import java.io.*;
class Test01{
	public static void main(String args[]) throws IOException{
	/*	File f=new File("Tiger.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
	
		File f=new File("Test");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
	

		File f=new File("Test");
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.delete());

	*/
		File f=new File("D://coreJava12Pm//Logical");
		String names[]=f.list();
		int cls=0;
		int jv=0;
		for (String name : names){
			if(name.contains(".java")){
				jv++;
			}else{
				cls++;
			}
		}
		System.out.println("Total java file  : "+jv);
		System.out.println("Total class file : "+cls);
	}
}