package Test01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SlipperOutStreamTest {

	public static void main(String[] args) {
		try {
			FileOutputStream output = new FileOutputStream("C:\\test\\testing.csv");
			
			int count = 0;
			String x = "15Ка";


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
