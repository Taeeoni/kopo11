package Test01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SlipperExcel {
	
	int i;
	
	public SlipperExcel(int i) {
		this.i = i;
	}
	
	public String RoadName() {

		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\test\\seoulapart2021.csv"));
			List<String> list = new ArrayList<>();
								
			String line;
			int count = 0;
			while ((line = br.readLine()) != null) {
				//#11 roadname
				if(count >= 17) {
				String [] lineSplit = line.split(",");
				list.add(lineSplit[12]);
				}
				count++;
			}
			return list.get(this.i);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
