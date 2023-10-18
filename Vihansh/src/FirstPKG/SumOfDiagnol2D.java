package FirstPKG;

public class SumOfDiagnol2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a2d = {{1,2,3,4},
						{5,6,7,8},
						{9,0,0,9},
						{8,7,6,5}};
		int ml = a2d[0].length;
		int[] de1 = new int[ml];
		int sum1 = 0;
		int[] de2 = new int[ml];
		int sum2 = 0;
		for(int i=0; i<ml; i++) {
			de1[i]=a2d[i][i];
			de2[i]=a2d[i][ml-1-i];
		}
		for(int i=0; i<de1.length; i++) {
			System.out.print(de1[i]+"+");
			sum1+=de1[i];
		}
		System.out.println(": "+sum1);
		for(int i=0; i<de2.length; i++) {
			System.out.print(de2[i]+"+");
			sum2+=de2[i];
		}
		System.out.println(": "+sum2);
		
		}
}
