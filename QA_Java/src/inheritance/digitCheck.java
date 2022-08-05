package inheritance;

public class digitCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dig = "465144407318593";
		int count = 1, sum = 0;
		int num = 0;
		int check = 0;
		for (int i = 0; i <= dig.length() - 1; i++) {

			num = Character.getNumericValue(dig.charAt(i));

			if (count % 2 != 0) {

				if ((num * 2) >= 10) {
					num = ((num * 2) % 10) + 1;
				} else {
					num = num * 2;
				}

			}
			sum += num;
			count++;
		}

		if (sum % 10 == 0) {
			check = 0;
		} else
			check = 10 - sum % 10;

		System.out.println(check);

	}

}
