public class ArraySumCalculator {

    
    public static int calculateSum(int[] array) {
        int sum = 0;
        
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5};

       
        int result = calculateSum(numbers);

       
        System.out.println("The sum of the array elements is: " + result);
    }
}
