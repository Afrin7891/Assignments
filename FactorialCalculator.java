import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculator {

    // Method to compute factorial of a non-negative integer
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative integers.");
        } else {
            BigInteger fact = factorial(number);
            System.out.println("Factorial of " + number + " is: " + fact);
        }
        scanner.close();
    }
}
