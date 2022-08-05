package Abstraction;

public class testMain {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.sound();
		d.structure();
		d.breath();
		
		Tiger t = new Tiger();
		t.speed();
		t.reproduce();
		t.sound();
		
		Human h = new Human();
		h.breath();
		h.structure();
		h.sound();

	}

}
