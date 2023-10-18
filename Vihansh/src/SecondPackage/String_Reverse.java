package SecondPackage;

import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s3 = sc.nextLine();
		String Reverse = "";
		for (char c : s3.toCharArray()) {
			Reverse = c + Reverse;
		}
		System.out.println(Reverse);
	}
}
