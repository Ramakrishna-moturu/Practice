package FirstPKG;

public class ImpementingInterface implements Centralinterface, continentaltraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		localmethod();
		ImpementingInterface ii=new ImpementingInterface();
		ii.localmethod2();
		Centralinterface Ci=new ImpementingInterface();
		Ci.green();
		Ci.Red();
		Ci.Yellow();
		continentaltraffic Cni=new ImpementingInterface();
		Cni.trainsymbol();
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("green");

	}

	@Override
	public void Red() {
		// TODO Auto-generated method stub
		System.out.println("RED");
	}

	@Override
	public void Yellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow");
	}

	@Override
	public void trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("trainsymbol");
	}

	public static void localmethod() {
		System.out.println("from local static");
	}
	public static void localmethod2() {
		System.out.println("from local nonstatic");
	}
}
