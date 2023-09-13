package FirstPKG;

public class This_Child{
	
	String name="Rama Krishna Son";
	
	public void getname() {
		String name = "Local";
		System.out.println(this.name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		This_Child tc = new This_Child();
		tc.getname();
	}

}
