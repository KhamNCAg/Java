package Day3;

public class GCDComputer {

	public static void main(String[] args) {
		System.out.println("Output: "+gcd(48, 18));
	}
	
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}