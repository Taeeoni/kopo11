package Review03;

import java.util.Scanner;

public class Review03R2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();

		System.out.print("100-" + a);
		System.out.print(" + ");
		System.out.print("100-" + b);
		System.out.print(" = ");
		int n = (100 - Integer.parseInt(a)) + (100 - Integer.parseInt(b));
		System.out.println(n);
		System.out.print(100 - Integer.parseInt(a));
		System.out.print(" X ");
		System.out.print(100 - Integer.parseInt(b));
		System.out.print(" = ");
		int m = (100 - Integer.parseInt(a)) * (100 - Integer.parseInt(b));
		System.out.println(m);
		System.out.println("First two digits : 100 - " + n + " = " + (100 - n) );
		System.out.println("Last two digits : " + m);
		System.out.print("Result : ");
		System.out.print(((100 - n) * 100) + m);

	}

}
