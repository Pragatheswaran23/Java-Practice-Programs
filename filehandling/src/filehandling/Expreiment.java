package filehandling;

import java.io.File;
import java.io.IOException;

public class Expreiment {
	
	public static void main(String[] args) throws IOException {
		
		File f1 = new File("Batman.txt");
		f1.createNewFile();
		System.out.println(f1.exists());
		
		File f2 = new File("DC");
		f2.mkdir();
		System.out.println(f2.exists());
		
		File f3 = new File(f2, "file1.txt");
		File f4 = new File("DC", "file2.txt");
		f3.createNewFile();
		f4.createNewFile();
		
		System.out.println(f3.isFile());
		System.out.println(f2.isDirectory());
		
		File f5 = new File("DC", "file3.txt");
		f5.mkdir();
		
		File f6 = new File("DC", "file4");
		f6.createNewFile();
	}

}
