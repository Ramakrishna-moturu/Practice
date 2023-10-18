package FirstPKG;

import java.util.Scanner;

public class Palindrom_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Text");
		String s = sc.next();
		String revs="";
	//	String pattern = "\s";
//		s=s.replaceAll(pattern, "");
		char c[] = s.toCharArray();
//		char rc[]= new char[s.length()];
		for(int i=s.length()-1; i>=0; i--) {
			revs = revs+c[i];
		}
		System.out.println(revs);
	}

}
