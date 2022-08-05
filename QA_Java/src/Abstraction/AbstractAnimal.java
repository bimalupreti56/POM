package Abstraction;

public abstract class AbstractAnimal {

	public abstract void sound();
	public abstract void structure();
	public abstract void speed();
	public abstract void habitat();
	
	public final void reproduce() {
		System.out.println("Animal reproduces");
	}
	
	public final void breath() {
		System.out.println("Animal breaths");
	}
}
