package FirstPKG;

public class Java_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Data types
		int a = 5;
		String s = new String();
		String s1 = "Instant value";
		s = "value assigned later for variable";
		Double d = 67.900010;
		float f = 23.01f;
		boolean condition = true;
		char c = 'a';

		System.out.println(s1 + " " + s + " " + d + " " + f + " " + a + " " + condition + " " + c);

//		Arrays

		int[] arr1 = new int[5];
		arr1[0] = 2;
		arr1[1] = 0;
		arr1[2] = 1;
		arr1[3] = 4;
		arr1[4] = 3;

		int[] arr2 = { 9, 7, 0, 3, 3, 5, 6 };
		arr2[4] = 0;

		String[] str0 = new String[6];
		str0[0] = "RK";
		String[] str = { "Rama Krishna", "Nirmala", "Vihansh", "Chinnodu", "Sanyasirao", "Sita" };

		Boolean[] TF = { true, false, false, true, false };
		char[] ca = s.toCharArray();
		int size = ca.length;
		System.out.println(TF + " " + size);

// Loops		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		int i = 0;
		while (i < str.length) {
			System.out.println(str[i]);
			i++;
		}
//		Reverse each name

		for (String l : str) {
			char[] cha = l.toCharArray();
			String namereverse = "";
			for (int j = cha.length - 1; j >= 0; j--) {
				namereverse = namereverse + cha[j];
			}
			System.out.println(namereverse);
		}

	}

}
