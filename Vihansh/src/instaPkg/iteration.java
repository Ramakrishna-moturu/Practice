package instaPkg;

class sample{
	static int tally =0;
	public void put(int a, int b) {
		for(; a<10; ++a)
			++b;
		tally += b;
	}
}
public class iteration {

	public static void main(String[] args) {
		int m=2, n=4;
		sample sa = new sample();
		sa.put(m, n);
		System.out.println(sample.tally);
	}

}
