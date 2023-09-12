package FirstPKG;

public class arraysort {
// Sorting array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] ar = { 85, 65, 6, 85, 72 };
		 for (int i = 0; i < ar.length; i++) {
			 for(int k=i+1; k<ar.length; k++) {
	              if (ar[i] < ar[k]) {
	                    int temp = ar[i];
	                    ar[i] = ar[k];
	                    ar[k] = temp;
	                }
	            }
		 }
		 System.out.println("Decending Sort: ");
		 for(int j=0; j<ar.length; j++) {
			 System.out.print(ar[j]+" ");
		 }
		 System.out.println();
		 System.out.println("Acending Sort: ");
		 for(int j=ar.length-1; j>=0; j--) {
			 System.out.print(ar[j]+" ");
	        }
	}
}

