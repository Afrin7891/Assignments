import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        
        int letterCount = 0;
        int whitespaceCount = 0;
        int digitCount = 0;

        
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isWhitespace(ch)) {
                whitespaceCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

      
        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of whitespace characters: " + whitespaceCount);
        System.out.println("Number of digits: " + digitCount);

        scanner.close();
    }
}
