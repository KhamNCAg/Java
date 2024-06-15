package Day2.SumOfNaturalNumbers;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scnr.nextInt();
		if(n>0) {
			System.out.println("Sum using for loop: " + sumUsingForLoop(n));
			System.out.println("Sum using while loop: " + sumUsingWhileLoop(n));
		}else {
			System.out.println("The Input Should Be Greater Than 0.");
		}
	}
	private static int sumUsingForLoop(int n){
		int rtrnVar = 0;
		for (int i=1; i<=n; i++) {
			rtrnVar += i;
		}
		return rtrnVar;
	}
	
	private static int sumUsingWhileLoop(int n){
		int rtrnVar = 0;
		int i = 1;
		while (i <= n) {
			rtrnVar += i;
			i++;
		}
		return rtrnVar;
	}
}
