package FirstPKG;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		With same memory allocation
		String s0 = "Rama Krishna";
		String s1 = "Rama Krishna";
//		New Memory will be created as new string	
		String s2 = new String("Vihansh");
		String s3 = new String("Vihansh Chinnodu");
//		Split	
		String[] SA = s1.split(" ");
		for (String s : SA) {
			System.out.println(s);
		}
//		Revrse
		String Reverse = "";
		for (char c : s3.toCharArray()) {
			Reverse = c + Reverse;
		}

		System.out.println(Reverse);

	}
	public static void Sumfromstringclass(int a, int b) {
		int c;
		c=a+b;
		System.out.println(c);
	
	}

}
