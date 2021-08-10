package concepts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileHandling {

	public static void main(String[] args) throws FileNotFoundException {

		try {
			File file = new File("test.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));

			String st;
			while ((st = br.readLine()) != null)
				System.out.println(st);

		} catch (Exception e) {
			System.out.println(e);
		}

//		
	}
}
