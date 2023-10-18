package FirstPKG;

public class Arrayreverse_challenge {
// swping 1st and last elements
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = {12,23,34,45,56,78,89,90};
		int temp;
		for(int i=0; i<(ar.length/2); i++) {
			temp=ar[i];
			ar[i]=ar[ar.length-1-i];
			ar[ar.length-1-i]=temp;
		}
		for(int j=0; j<ar.length; j++) {
			System.out.print(ar[j]+" ");
		}
	}

}
