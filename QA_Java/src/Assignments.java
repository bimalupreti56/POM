
public class Assignments {

	public static void main(String[] args) {
		
		// prints the pattern 
        for (int i = 5; i > 0; i--) {
        	for (int j = i-1; j < 5; j++) {
				System.out.print("*");
			}
        	System.out.println("");
			
		}
        
        // reverses a string 
    	String test = "hello world";
    	String rev = "";
    	
    	for (int i = test.length()-1; i >= 0; i--) {
    		rev += test.charAt(i);
    	}
    	System.out.println(rev);
        
        //sum of num 1-100
        int sum = 0;
        for (int i = 0; i < 100; i++) {
			sum += i;
		}
        System.out.println(sum);
        
    
    	
    	//fahrenheit to celsius 
    	int Fahrenheit = 43;  
        int Celsius  = ((Fahrenheit-32)*5)/9;  
        System.out.println("Temperature in celsius is: "+Celsius);

	}

}
