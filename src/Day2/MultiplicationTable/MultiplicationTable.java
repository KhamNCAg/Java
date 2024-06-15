package Day2.MultiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a number: ");
		printMultiplicationTable(scnr.nextInt());
	}
	
	private static void printMultiplicationTable(int n){
		System.out.println("Multiplication Table:");
		for(int i = 1;i <= n; i++) {
			for(int j = 1; j <= n; j++) {			
				System.out.printf("%s x %s = %s\t", i, j, i*j);
			}
			System.out.println();
		}
	}

}