package javaprograms;

import java.io.*;

public class ReadFromFile {
	public static void main(String[] args) {
		try {
			FileReader reader=new FileReader("D:\\22701a3353");
			int ch;
			while((ch=reader.read())!=-1) {
				System.out.println((char)ch);
			}
			reader.close();
		}catch(IOException e) {
			System.out.println("Error:"+e.getMessage());
		}
	}
}