import java.util.Scanner;

public class FactorionNumbers3{
    
       private static final int[] factorials = new int[10];
    
    static {
        factorials[0] = 1;
        for (int i = 1; i < 10; i++) {
            factorials[i] = i * factorials[i - 1];
        }
    }
    
        private static boolean isFactorion(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += factorials[temp % 10]; 
            temp /= 10;
        }
        return sum == num;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the lower bound of the range: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upper = scanner.nextInt();
        
        System.out.println("Factorion numbers in the range:");
        boolean found = false;
        
        for (int i = lower; i <= upper; i++) {
            if (isFactorion(i)) {
                System.out.print(i + ", ");
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("None");
        }
        scanner.close();
    }
}