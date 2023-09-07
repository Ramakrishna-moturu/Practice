package FirstPKG;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// calling local methods Directly
		System.out.println(sum(3,5));
//	calling local methods with object
		Methods m = new Methods();
		System.out.println(m.sum(10,20));
//	calling other class methods with object
		StringConcepts sc = new StringConcepts();
		sc.Sumfromstringclass(5, 9);
	}
	
	public static int sum(int a, int b) {
		int c;
		c=a+b;
		return c;
		
	}
	}

