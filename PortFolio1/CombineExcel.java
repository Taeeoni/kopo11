package Test01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CombineExcel {
	static List<String> list = new ArrayList<String>(); // 모든 csv

	public static void CombineExcel() throws IOException {
		File dir = new File("C:\\test\\seoulapart");
		File[] files = dir.listFiles();
		String line;
		int count = 0;
		int countF = 0;
		for (int i = 0; i < files.length; i++) { // csv 파일 개수 만큼
			BufferedReader br = new BufferedReader(new FileReader(files[i]));
			while ((line = br.readLine()) != null) {
				if (countF == 0) {
					if (count >= 15) {
						list.add(line + "\n");
					}
				} else if (countF >= 1) {
					if (count >= 16)
						list.add(line + "\n");
				}
				count++;
			}
			countF++;
			count = 0;
		}

		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\test\\seoulapart\\listout.csv", true));

		for (int j = 0; j < list.size(); j++) {
			writer.write(list.get(j));
		}
		writer.close();
		SlipperExcel excel = new SlipperExcel();
		excel.RoadNameList();
	}
}
