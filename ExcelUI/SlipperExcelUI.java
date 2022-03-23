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

	public void RoadDataA() {

		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\test\\seoulapart2021.csv"));
			File file = new File("C:\\test\\Search.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
			HashSet<String> list = new HashSet<>();

			System.out.println("찾기 원하는 시군구를 입력하시오");

			Scanner scan = new Scanner(System.in);
			String name = scan.nextLine();

			String line;
			int count = 0;
			while ((line = br.readLine()) != null) {
				if (count >= 17) {
					String[] lineSplit = line.split(",");
					if(lineSplit[0].equals(name)) {
						bw.newLine();
						for(int a = 0; a < lineSplit.length; a++) {
							bw.write(lineSplit[a] + ",");
						}
					}
				}
				count++;				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void RoadDataG() {

		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\test\\seoulapart2021.csv"));
			File file = new File("C:\\test\\Search.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
			HashSet<String> list = new HashSet<>();

			System.out.println("찾기 원하는 계약년도를 입력하시오");

			Scanner scan = new Scanner(System.in);
			String name = scan.nextLine();

			String line;
			int count = 0;
			while ((line = br.readLine()) != null) {
				if (count >= 17) {
					String[] lineSplit = line.split(",");
					if(lineSplit[6].equals(name)) {
						bw.newLine();
						for(int a = 0; a < lineSplit.length; a++) {
							bw.write(lineSplit[a] + ",");
						}
					}
				}
				count++;			
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void Menu() {
		System.out.println("Menu");
		System.out.println("1. 시군구");
		System.out.println("2. 계약년월");
		Scanner scan = new Scanner(System.in);
		this.i = scan.nextInt();
		if (this.i == 1) {
			RoadDataA();
		} else if (this.i == 2) {
			RoadDataG();
		}

	}

}
