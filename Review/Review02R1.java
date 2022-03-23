package Review02;

import java.util.List;
import java.util.Scanner;

public class Review02R1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please inputs 0 or 1, 12times");
		String[] nums = scan.nextLine().split("");

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if (i % 4 == 3) {
				System.out.println("");
			}
		}
		int count = 0; int count2 = 0; int count3 = 0;		
		int ver = 0; int ver2 = 0; int ver3 = 0; int ver4 = 0;
		
		loop:
		for (int i = 0; i < nums.length; i++) {			
			// horitontally
			if (i < 4) {				
				if (nums[i].equals("0")) {
					count++;
				}
				if (count == 4) {
					System.out.println("Pass");
					break loop;
				}
			}
			
			if (i >= 4 && i < 8) {
				if (nums[i].equals("0")) {
					count2++;
				}
				if (count2 == 4) {
					System.out.println("Pass");
					break loop;
				}
			}
			
			if (i > 8) {
				if (nums[i].equals("0")) {
					count3++;
				}
				if (count3 == 4) {
					System.out.println("Pass");
					break loop;
				}
			}
			// vertically
			if(i % 4 == 0) {
				if (nums[i].equals("0")) {
					ver++;
				}
				if (ver == 3) {
					System.out.println("Pass");
					break loop;
				}
			}
			
			if(i % 4 == 1) {
				if (nums[i].equals("0")) {
					ver2++;
				}
				if (ver2 == 3) {
					System.out.println("Pass");
					break loop;
				}
			}
			
			if(i % 4 == 2) {
				if (nums[i].equals("0")) {
					ver3++;
				}
				if (ver3 == 3) {
					System.out.println("Pass");
					break loop;
				}
			}
			
			if(i % 4 == 3) {
				if (nums[i].equals("0")) {
					ver4++;
				}
				if (ver4 == 3) {
					System.out.println("Pass");
					break loop;
				}
			}			
			//not fit any conditions
			if(i == nums.length - 1) {
				System.out.println("fail");
			}
		}
	}
}
