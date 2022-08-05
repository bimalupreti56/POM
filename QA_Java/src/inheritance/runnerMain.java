package inheritance;

public class runnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		a1.eat();
		
		System.out.println();
		Dog d1 = new Dog();
		d1.eat(); // overrides eat methad from parent class
		d1.bark();
		d1.reproduce();
		
		System.out.println();
		Cat c1 = new Cat();
		c1.move();// overrides move method from grandparent class
		c1.meow();
	}

}
