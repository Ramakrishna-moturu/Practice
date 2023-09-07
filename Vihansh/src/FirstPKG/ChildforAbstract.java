package FirstPKG;

public class ChildforAbstract extends AbstractParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildforAbstract CA = new ChildforAbstract();
		CA.ABP1();
		CA.ABP2();
		CA.local();
	}

	@Override
	public void ABP2() {
		// TODO Auto-generated method stub
		System.out.println("unimplemented in Abstract");
	}
	public void local() {
		System.out.println("local");
	}

}
