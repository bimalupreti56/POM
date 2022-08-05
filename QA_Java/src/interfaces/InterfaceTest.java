package interfaces;

public class InterfaceTest {
	
	public static void main(String[] args) {
		
		System.out.println("BOKBank");
		BOKBank b = new BOKBank();
		b.interestRate();
		b.branch();
		
		System.out.println("\nNabilBKR: ");
		NabilBKR n = new NabilBKR();
		n.interestRate();
		n.branch();
		
		System.out.println("\nNabilKTM: ");
		NabilKTM nk = new NabilKTM();
		nk.branch();
		nk.interestRate();

	}

}
