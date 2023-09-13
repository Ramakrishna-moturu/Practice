package FirstPKG;

public class Super_Keyword_Parent {

	public Super_Keyword_Parent() {
		System.out.println("Parent Constructor");
	}
	String Name = "Rama Krishna Parent";
	String Name1 = "Nirmala Parent";
	public void getname() {
		System.out.println(Name1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_Keyword_Parent skp = new Super_Keyword_Parent() ;
		System.out.println(skp.Name);
	}

}
