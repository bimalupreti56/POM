
public class Student {

	String name;
	int age;
	int rollNum;
	String semester;
	String department;
	
	Student(String name, int age, int rollNum, String semester, String department){
		System.out.println("Name: "+name);
		System.out.println("rollNum: "+rollNum);
		System.out.println("semester: "+semester);
		System.out.println("department: "+department);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Bimal Upreti",20,123,"1st Semester","it");
		System.out.println("----------------------");
		Student s2 = new Student("Ram AK",25,124,"2nd Semester","finance");
	}

}
