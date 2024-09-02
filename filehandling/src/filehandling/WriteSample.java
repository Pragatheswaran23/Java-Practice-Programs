package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteSample {
	
	public static void main(String[] args) throws IOException {
				
		/*
		FileWriter f = new FileWriter("file.txt")
		FileWriter f2 = new FileWriter(f);
		FileWriter f3 = new FileWriter(f,true);
		FileWriter f4 = new FileWriter(f,false);
		*/
		
		FileWriter f = new FileWriter("Bullet.txt", true);
		
		f.write(101);
		f.flush();
		
		char [] ch = {100, 101, 102};
		f.write(ch);
		
		
		f.close();
		
		
		

	}

}
