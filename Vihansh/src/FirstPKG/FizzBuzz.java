package FirstPKG;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
	public static List<String> FizzBuzz(int n) {
		List<String> result = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				result.add("FIZZBUZZ");
			} else if (i % 3 == 0) {
				result.add("FIZZ");
			} else if (i % 5 == 0) {
				result.add("BUZZ");
			} else {
				result.add(Integer.toString(i));
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> FB = FizzBuzz(n);
		for (String s : FB) {
			System.out.println(s);
		}

	}
}
