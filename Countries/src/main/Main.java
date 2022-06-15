package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	File file = new File("D:\\countries.txt");
	if(!file.exists()) {
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	try(OutputStream out = new FileOutputStream(file)){
		String a = "s";
		out.write(" Azerbaijan".getBytes());
		out.write("\n Turkey".getBytes());
		out.write("\n U.S.A".getBytes());
		out.write("\n United Kingdom".getBytes());
		out.write("\n Russia".getBytes());
		out.write("\n China".getBytes());
		out.write("\n France".getBytes());
		out.write("\n India".getBytes());
		out.write("\n Germany".getBytes());
		out.write("\n Japan".getBytes());
		
	}catch (Exception ex) {
		ex.printStackTrace();
	}
	try {
		Scanner sc = new Scanner(file);
		for(int i= 0; i<10; i++) {
			System.out.println(sc.nextLine());
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	}

}
