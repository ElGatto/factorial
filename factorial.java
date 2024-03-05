import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculator {

    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer of any size: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            BigInteger result = factorial(BigInteger.valueOf(num));
            System.out.println("Factorial of " + num + " is " + result);
        }
        
        scanner.close();
    }
}
