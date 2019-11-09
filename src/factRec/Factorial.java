package factRec;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Scanner object
		Scanner myObj = new Scanner(System.in);
		// Prompt user
		System.out.println("Please enter number to find its factorial");
		int x = myObj.nextInt();
		myObj.close();
		System.out.print(x + "! = " + CalcFactorial.factorial(x));
	}

}
