package com.cybersolveit.core.java;

public class StringHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s1 [] = {'h','e','l','l','o'};
		System.out.println(s1[0]);
		
		String s2 = "whatsup";
		System.out.println(s2.length());
		
		String s3 = "whatsup";
		System.out.println(s2.compareTo(s3));
		
		String s4 = "flag";
		System.out.println(s3.compareTo(s4));
		s4.concat(s3);
		s3.toUpperCase();
		System.out.println(s4);
		
		for (int i = 0; i < s4.length(); i++) {
			if (s4.charAt(i) == 'g')
					System.out.println("It contains letter g");
			else if (s4.charAt(i) == 'z') 
				System.out.println("it contains letter z");
		}
	}

}
