import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        
        double discriminant = b * b - 4 * a * c;

        
        if (discriminant >= 0) {
            
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            
            double smallestPositiveRoot = Double.MAX_VALUE;
            if (root1 > 0) {
                smallestPositiveRoot = root1;
            }
            if (root2 > 0 && root2 < smallestPositiveRoot) {
                smallestPositiveRoot = root2;
            }

            
            if (smallestPositiveRoot != Double.MAX_VALUE) {
                System.out.println("The smallest positive root is: " + smallestPositiveRoot);
            } else {
                System.out.println("There are no positive roots.");
            }
        } else {
            
            System.out.println("No real roots exist.");
        }

        scanner.close();
    }
}
