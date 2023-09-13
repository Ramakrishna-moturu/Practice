package FirstPKG;

public class Super_Keyword_Child extends Super_Keyword_Parent {

	public Super_Keyword_Child() {
		super();					// even if we are not using due to constructor it will call parent constructor only
		System.out.println("Child Constructor");
	}

	String Name = "Vihansh Child";
	String Name1 = "Chinnodu";
//	public void getname() {
//		System.out.println(super.Name); // From parent due to super
//		System.out.println(Name);
//		super.getname();// From Child
//		}

//	Using super keyword only we can access parent class variables and methods when we have duplicate names

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Super_Keyword_Child skc = new Super_Keyword_Child();
//		System.out.println(skc.Name);
//		System.out.println(skc.Name1);
//		skc.getname();
	}

}
