package day24;

import java.io.File;

public class FileClass {

	public static void main(String[] args) {
		// creating an object to check if the file exist
		File file = new File("C:/Users/E hasani/OneDrive/Desktop/Secret_message.txt");
		if(file.exists()) {
			System.out.println("That file exist :o");
			System.out.println(file.getPath());//this will print the path of file
			System.out.println(file.getAbsolutePath());//this will print the absolute path of the file
			System.out.println(file.isFile());//this will print true if it is a file.
			file.delete();//this will delete the file from my computer.
		}else {
			System.out.println("That file doesn't exist :(");
		}
	}
	

}
