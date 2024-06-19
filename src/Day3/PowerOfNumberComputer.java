package Day3;

public class PowerOfNumberComputer {

	public static void main(String[] args) {
		System.out.println("Output: "+power(2, -3));
	}

    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }else if (exponent == 1) {
            return base;
        }else if (exponent > 0) {
            return base * power(base, exponent - 1);
        }else {
            return 1 / power(base, -exponent);
        }
    }

}