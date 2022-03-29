package Test01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SlipperExcel {
	protected static List<String> list = new ArrayList<>();

	public void RoadNameList() {

		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\test\\seoulapart\\listout.csv"));
			HashSet<String> roads = new HashSet<String>();

			String line;
			int count = 0;
			while ((line = br.readLine()) != null) {
				// #11 roadname
				if (count >= 1) {
					String[] lineSplit = line.split(",");				
					if(lineSplit[12] != null && lineSplit[12].contains("·Î")) {
					String road = lineSplit[12];
					road = road.replaceAll("\"", "");
					roads.add(road);
					}
				}
				count++;
			}			
			Iterator iter = roads.iterator();
			for (int i = 0; i < roads.size(); i++) {
				list.add((String) iter.next());				
			}
			Collections.sort(list);
			SlipperCrawling sc = new SlipperCrawling();
			sc.Crawling();
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}	
}
