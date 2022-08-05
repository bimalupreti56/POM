package interfaces;

public class CalculateRectangle implements CalculateShape{

	
	public void calcArea() {}
	
	public int calcArea(int a, int b) {
		return a * b;
	}

	public static void main(String args[]) {
		
		CalculateRectangle cal = new CalculateRectangle();
		System.out.println(cal.calcArea(4,3));
	}
}
