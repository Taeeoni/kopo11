package Test01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SlipperMatch {

	public void Output() {
		int craw = 0;
		String path = "C:\\test\\seoulapart2021.csv";
		File file = null;
		BufferedWriter bw = null;
		String line;
		SlipperCrawling sc = new SlipperCrawling();
		List<String> Dlist = sc.Distance;

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			file = new File("C:\\test\\DistanceFinish.csv");
			bw = new BufferedWriter(new FileWriter(file, true));

			int count = 0;
			while ((line = br.readLine()) != null) {
				String[] lineSplit = line.split(",");
				String a = "";
				int b = 0;
				String ox = "X";
				if (count == 0) {
					bw.newLine();
					bw.write(line + "," + "백화점까지거리" + "," + "슬세권");
				}
				if (count >= 1) {
					String road = lineSplit[12];
					road = road.replaceAll("\"", "");
					for (int i = 0; i < Dlist.size(); i++) {
						if (Dlist.get(i).contains(road)) {
							// substring #min
							a = Dlist.get(i).substring(Dlist.get(i).indexOf("-"), Dlist.get(i).length());
							if(a.contains("분")) {
								b = Integer.parseInt(a.replaceAll("분", ""));
								if(b <= 20) {
									ox = "O";
								}
							}													
						} else {
							a = "";
						}
					}
					bw.newLine();
					bw.write(line + "," + a + ox); 
					break;
				}
				count++;
			}
			bw.flush();
			bw.close();
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
