package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SlipperOutStreamTest {

	public static void main(String[] args) {
		
		String line;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\javatest\\seoulapart2021.csv"));
			File file = new File("C:\\javatest\\seoulapart2021 - บนป็บป.csv");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, false));
			String data = "16"; // need to input from SlipperCrwaling
				while((line = br.readLine())!= null) {
					String line2 = line + "," + data + "\n";
					bw.write(line2);
				}

			bw.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}