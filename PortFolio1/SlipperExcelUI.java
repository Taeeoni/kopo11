package Test01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class SlipperExcelUI {

	int i;

	public SlipperExcelUI(int i) {
		this.i = i;
	}

	public void Menu2() {

		try {
			System.out.println("찾기 원하는 시군구를 입력하시오");
			Scanner scan = new Scanner(System.in);
			String name = scan.nextLine();
			System.out.println("찾기 원하는 계약년월을 입력하시오 (ex: 201001)");
			String year = scan.nextLine();

			BufferedReader br = new BufferedReader(new FileReader("C:\\test\\seoulapart\\DistanceFinish.csv"));
			File file = new File("C:\\test\\seoulapart\\Search.csv");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

			String line;
			int count = 0;
			while ((line = br.readLine()) != null) {
				String[] lineSplit = line.split(",");
				if (count == 0) {
					for (int a = 0; a < lineSplit.length; a++) {
						bw.write(lineSplit[a] + ",");
					}
				} else if (count >= 1) {
					if (lineSplit[0].contains(name) && lineSplit[6].contains(year)) {
						bw.newLine();
						for (int a = 0; a < lineSplit.length; a++) {
							bw.write(lineSplit[a] + ",");
						}
					}
				}
				count++;
			}
			bw.flush();
			br.close();
			bw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void RoadDataG() {

		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\test\\seoulapart\\DistanceFinish.csv"));
			File file = new File("C:\\test\\seoulapart\\Search.csv");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

			System.out.println("찾기 원하는 계약년월을 입력하시오 (ex: 201001)");

			Scanner scan = new Scanner(System.in);
			String name = scan.nextLine();
			String line;
			int count = 0;

			while ((line = br.readLine()) != null) {
				String[] lineSplit = line.split(",");
				if (count == 0) {
					for (int a = 0; a < lineSplit.length; a++) {
						bw.write(lineSplit[a] + ",");
					}
				} else if (count >= 1) {
					if (lineSplit[6].equals(name)) {
						bw.newLine();
						for (int a = 0; a < lineSplit.length; a++) {
							bw.write(lineSplit[a] + ",");
						}
					}
				}
				count++;
			}
			bw.flush();
			br.close();
			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void Menu() {
		System.out.println("Menu");
		System.out.println("1. 시군구 입력");
		System.out.println("2. 전체 선택");
		Scanner scan = new Scanner(System.in);
		this.i = scan.nextInt();
		if (this.i == 1) {
			Menu2();
		} else if (this.i == 2) {
			RoadDataG();
		} else {
			System.out.println("Error");
			Menu();
		}

	}

}
