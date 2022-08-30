
public class CountNumberOfStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Welcome";
		String rev = "";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ')
				count += 1;
		}
		
		// reversing a string
		for (int i = input.length()-1;i >= 0; i--) {
			rev += input.charAt(i);
		}
		System.out.println(rev);
		System.out.println("Count is: "+count);
	}

}
