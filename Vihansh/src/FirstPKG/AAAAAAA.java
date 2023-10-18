package FirstPKG;

public class AAAAAAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String Reverse
		/*
		 * String s = "i am good in java 908 "; String f = s.trim(); String[] array =
		 * f.split(" "); for (int i = array.length - 1; i >= 0; i--) { String Word =
		 * array[i]; String WordRevers = ""; for (int j=Word.length()-1; j>=0; j--) {
		 * WordRevers += Word.charAt(j); } System.out.print(WordRevers+" "); }
		 */
		String Str1 = "i am vihansh";
		String str2 = "am i havinsh";

		int count1 = 0;
        int count2 = 0;
        if (Str1.length() == str2.length()) {
            for (int i = 0; i < Str1.length(); i++) {
                for (int j = 0; j < Str1.length(); j++) {
                    if (Str1.charAt(i) == Str1.charAt(j)) {
                        count1++;
                    }
                    if (Str1.charAt(i) == str2.charAt(j)) {
                        count2++;
                    }
                }

            }
            if (count1 == count2) {
                System.out.println("its an anagram");
            } else {
                System.out.println("its not an anagram");
            }

        }

    }
}
