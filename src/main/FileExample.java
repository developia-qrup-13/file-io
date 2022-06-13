package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
import java.io.FileOutputStream;

public class FileExample {
	

	public static void main(String[] args) {
		
		File file=new File("D:\\eclipse\\output.txt");
		
		if (!file.exists()) {
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

		
		try (OutputStream out = new FileOutputStream (file)){
			String a = "s";
			out.write("13\n".getBytes());
			out.write("vs\n".getBytes());
			out.write("EVERYBODY\n".getBytes());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		try {
			Scanner sc=new Scanner(file);
			for(int i=0;i<9;i++) {
				System.out.println(sc.nextLine());
			}
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
}
}