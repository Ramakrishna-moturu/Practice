package FirstPKG;

import java.util.Arrays;
import java.util.Scanner;

// rotate the array by required position in clock-wise direction
public class Rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 1, 2, 3, 4, 5 };

		Scanner sc = new Scanner(System.in);
		System.out.println("How many clock turns");
		int ct = sc.nextInt() % ar.length;
		int ra[] = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			int ind = (i - ct) % (ar.length);
			if (ind >= 0) {
				ra[i] = ar[ind];
			} else {
				ra[i] = ar[ar.length + ind];
			}
		}
		for (int j = 0; j < ra.length; j++) {
			System.out.print(ra[j] + " ");
		}
	}
}
