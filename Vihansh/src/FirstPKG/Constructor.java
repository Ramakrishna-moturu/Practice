package FirstPKG;

public class Constructor {
	public Constructor() {
		System.out.println("From Explicit Constructor");
	}
	public Constructor(String s) {
		System.out.println("From Explicit parameterised String "+ s);
	}
	public static void method() {
		System.out.println("External method without specific return type");
	}
// by default main method calls implicit constructor when any constructors are not created
//	if any one created it expects same parameters
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Constructor c1 = new Constructor();
	Constructor c2 = new Constructor("Rama Krishna");
	method();

	}

}
