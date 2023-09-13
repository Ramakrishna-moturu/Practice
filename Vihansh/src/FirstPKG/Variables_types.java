package FirstPKG;

public class Variables_types {

	
	String name;
	String address;													// Instance Variable
	static String city = "Vijayawada";								// Class Variable
	static {
		city = "Vijayawada2";										// we can initialize in static block for static variables
	}
	public void data(String name, String address ) {				// local Variables
		System.out.println(name+", "+address+", "+city);
		if(city=="Vijayawada") {
			city="Visakhapatnam";
		}else {
			city="Vijayawada";
		}
	}
	public static void custom(String s)
	{
		System.out.println(s+", "+city);				// Static method access only static variables
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variables_types vt = new Variables_types();
		vt.address="through object";					// non static variables and methods will call through obj only
//		System.out.println(city);
//		vt.data("Rama Krishna", "Enikepadu");
//		vt.data("Ramky","Vizag");
		custom("From Static Method");					// to call static method no need to create object
		Variables_types.custom("through class name calling");
		
	}

}
