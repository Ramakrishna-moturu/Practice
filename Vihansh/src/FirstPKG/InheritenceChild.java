package FirstPKG;

public class InheritenceChild extends InheritenceParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritenceChild IC = new InheritenceChild();
		System.out.println(IC.color);
		IC.Break();
		IC.AudioSystem();
		IC.Engine();
	}
public void Engine() {
	System.out.println("Engine Implemented internally");
}
}
