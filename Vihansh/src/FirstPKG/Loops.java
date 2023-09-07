package FirstPKG;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// For loop, while loop, do while loop
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "st loop in for");
		}
		int k = 0;
		while (k < 4) {
			System.out.println(k + "st loop in while");
			k++;
		}
		do {
			System.out.println(k + "guarentied 1 loop from do while");
			k++;
		} while (k > 6);
//		Nested for loop assignment increasing triangle
		int value = 1; // Starting Number
		for (int j = 0; j < 4; j++) {
			for (int m = 0; m <= j; m++) {
				System.out.print(value + "   ");
				value++;
			}
			System.out.println();
		}
//		Nested for loop assignment decreasing triangle
		for (int j = 0; j < 4; j++) {
			for (int m = 0; m < 4 - j; m++) {
				System.out.print(value + "   ");
				value++;
			}
			System.out.println();
		}
//	each row starts from 1	
		for (int j = 0; j <=4; j++) {
			for (int m = 1; m <= j; m++) {
				System.out.print(m+"   ");
			}
			System.out.println();
		}
	}
}
