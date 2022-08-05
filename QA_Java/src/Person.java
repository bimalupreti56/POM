
public class Person {

	String firstName; 
	String lastName;
	int age; 
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	Person(String name, String name2){
		firstName = name;
	}
	
	
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Bimal","Upreti");
		System.out.println(p1.toString());;
		p1.firstName = "Bimal";
		p1.lastName = "Upreti";
		
		
		
	}

}
