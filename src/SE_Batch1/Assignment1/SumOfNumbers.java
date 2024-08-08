package SE_Batch1.Assignment1;

import java.io.*;

public class SumOfNumbers {

	public static void main(String[] args) {
//		Ex1
		System.out.println("Ex1");
		System.out.println("The sum of numbers from 1 to 10 is: " + sum());
		System.out.println("----------------------------------------------");
		System.out.println();
		
		
//		Ex2
		System.out.println("Ex2");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number: ");    
        int number;
		try {
			number = Integer.parseInt(br.readLine());
			System.out.println("The factorial of " + number + " is: " + getFactorial(number));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------");
		System.out.println();

		
//		Ex3
		System.out.println("Ex3");
		System.out.print("Enter number: ");
		try {
			number = Integer.parseInt(br.readLine());
			printMultiplicationTable(number);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------");
	}
		
		
	
	private static int sum(){
		int rtrnVar = 0;
		for (int i=1; i<=10; i++) {
			rtrnVar += i;
		}
		return rtrnVar;
	}

	public static int getFactorial(int var) {
		int rtrnVar = 1;
        for (int i = 1; i <= var; i++) {
        	rtrnVar *= i;
        }
        return rtrnVar;
    }
	
	private static void printMultiplicationTable(int var){
		System.out.println("Multiplication Table for " + var + ":");
		for(int i = 1;i <= 10; i++) {
			System.out.printf("%s * %s = %s\t", var, i, var*i);
			System.out.println();
		}
	}
}