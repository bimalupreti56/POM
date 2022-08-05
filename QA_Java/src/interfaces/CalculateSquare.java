package interfaces;

public class CalculateSquare implements CalculateShape{

	
	public int calcArea() {}
	
	public int calcArea(int a) {
		return a * a;
	}
	
	public static void main(String args[]) {
		
		CalculateSquare cal = new CalculateSquare();
		System.out.println(cal.calcArea(4));
	}
}
