
public class CountNumberOfStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Welcome to the Java Programming Basic Course";
		
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ')
				count += 1;
		}
		System.out.println("Count is: "+count);
	}

}
