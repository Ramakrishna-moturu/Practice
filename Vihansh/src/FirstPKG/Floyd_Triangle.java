package FirstPKG;

import java.util.Scanner;

public class Floyd_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows Required:");
		int rows = sc.nextInt();
		int sv = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(sv+" ");
				sv++;
			}
			System.out.println();
		}

	}

}
