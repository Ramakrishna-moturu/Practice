package FirstPKG;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[3][3];
		int b[][][] = {{{1,2,3},{4,5,6},{7,8,9}},{{11,12,13},{14,15,16},{17,18,19}},{{21,22,23},{24,25,26},{27,28,29}}};
		
//		System.out.println(b.length);
		for(int x=0;x<3;x++){
			for(int y=0;y<3;y++) 
			{
				//for(int z=0;z<3;z++) {
					a[x][y]=b[2][y][x];
//					System.out.print(b[y][z][x]+",");
//				}
//				System.out.println();
			}
//			System.out.println();
		}
		for(int x=0;x<3;x++){
			for(int y=0;y<3;y++) {
				System.out.print(a[x][y]+", ");
			}
			System.out.println();
		}
		
		int q[][]= {{11,4,5},{6,1,0},{8,3,9}};
		int min=q[0][0]; 
		int column=0;
		
		for(int m=0;m<3;m++) {
			for(int n=0;n<3;n++) {
				if(q[m][n]<min) {
					min=q[m][n];
					column=n;
				}	
			}
		}
		System.out.println(min+" at "+column+ " Column");
		int max=q[0][column];
		for(int o=0;o<3;o++) {
			if(max<q[o][column]) {
			max=q[o][column];
			}
		}
		System.out.println(max);
		
	}

}
