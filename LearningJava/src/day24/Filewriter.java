package day24;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Filewriter {

	public static void main(String[] args) {
		// Writing a file
		try {
			FileWriter writer = new FileWriter("Poem.txt");
			writer.write("Roses are red");
			//writer.write("Vilents are blue");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
