import java.util.Scanner;
import java.math.*;

public class Exercise18_01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		String n = input.nextLine();

		
		System.out.println("Factorial of " + n + " is " 
			+ factorial(new BigInteger(n)));
	}

	
	public static BigInteger factorial(BigInteger n) {
		if (n.equals(BigInteger.ZERO)) 
			return BigInteger.ONE; 
		else 
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}
}
