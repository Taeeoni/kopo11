package Test01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SlipperExcelUITest {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\test\\seoulapart2021.csv"));
			List<String> list = new ArrayList<>();
			String line;
			int count = 0;
			
			
			while ((line = br.readLine()) != null) {
				// #11 roadname
				

				if (count >= 17) {
					String[] lineSplit = line.split(",");
					list.add(lineSplit[12]);
				}
					
				count++;
			}
			System.out.println(list.get(0));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
