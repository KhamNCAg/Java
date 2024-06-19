package Day3;

public class IntegerConverter {

	public static void main(String[] args) {
		System.out.println("Output: "+stringToInt("1234"));
	}

	public static int stringToInt(String s) {
		if (s.isEmpty()) {
	        return 0;
	    }
	    int firstDigit = s.charAt(0);
	    int remainingNumber = stringToInt(s.substring(1));
	    return (firstDigit-48) * (int) Math.pow(10, s.length() - 1) + remainingNumber;
	    
	}	

}