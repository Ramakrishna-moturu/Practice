package FirstPKG;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rowhight, count  = 10;
		rowhight=count;
			for (int i = 0; i < rowhight; i++) {
				for (int j = 0; j < count - i; j++) {
					System.out.print(" ");
				}for (int k = count-i; k <= i; k++) {
				System.out.print("*");
				}if(i<rowhight/2-1)
				{System.out.print("");
				}else
				{
					System.out.println();
				}
			}
//			Pyramid
			for (int i = 1; i <= rowhight; i++) {
	            // Print spaces before the stars
	            for (int j = 1; j <= rowhight - i; j++) {
	                System.out.print(" ");
	            }	            // Print stars
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("*");
	            }	            // Move to the next line
	            System.out.println();
	        }

// Right angle
		for (int i = 0; i <= rowhight; i++) {
			for (int j = 0; j < count - i; j++) {
				System.out.print(" ");
			}
			for (int k = count - i; k <= count; k++) {
				System.out.print("@");
			}
			System.out.println();
		}
// triangle right
		for (int i=0; i<=rowhight; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
