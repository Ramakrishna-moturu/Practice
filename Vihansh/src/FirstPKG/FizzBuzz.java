package FirstPKG;

//import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
//		List<String> result = new ArrayList<>();
		/*
		 * Scanner sc = new Scanner(System.in); int n = sc.nextInt(); for (int i = 1; i
		 * <= n; i++) { if (i % 3 == 0 && i % 5 == 0) { System.out.println("FIZZBUZZ");
		 * } else if (i % 3 == 0) { System.out.println("FIZZ"); } else if (i % 5 == 0) {
		 * System.out.println("BUZZ"); } else { System.out.println(i); } }
		 */
//		return result;
		for (int i=1; i<100; i++) {

			if (i % 3 == 0&&i%5==0) {
			System.out.println("FizzBuzz");
			}else if (i % 5 == 0) {
			System.out.println("Buzz");
			} else if (i%3==0) {
			System.out.println("Fizz");
			} else {
			System.out.println(i+", ");
			}
		}
	}

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * Scanner sc = new Scanner(System.in); int n = sc.nextInt(); List<String> FB =
	 * FizzBuzz(n); for (String s : FB) { System.out.println(s); }
	 * 
	 * }
	 */
}
