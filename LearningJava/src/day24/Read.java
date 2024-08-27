package day24;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// FileReader = read the content of a file as a stream of character.
		try {
			FileReader reader = new FileReader("C:\\Users\\E hasani\\OneDrive\\Desktop\\Art.txt");
			int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
