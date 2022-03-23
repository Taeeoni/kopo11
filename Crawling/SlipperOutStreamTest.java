package Test01;

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
		
		String path = "C:\\test\\seoulapart20211.csv";			
		File file = null;
		BufferedWriter bw = null;		
		String line;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			file = new File(path);
			bw = new BufferedWriter(new FileWriter(file, true));
			
			String data = "16Ка"; // need to input from SlipperCrwaling
		
				bw.write("," + data);
		
			bw.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
