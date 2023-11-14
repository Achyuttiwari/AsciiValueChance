import java.util.Scanner;

public class LettersToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String Which you want to convert to number");
        String inputString = scanner.nextLine();
        int result = convertToNumber(inputString);
        System.out.println(result);
    }

    static int convertToNumber(String letters) {
        int result = 0;
        for (int i = 0; i < letters.length(); i++) {
            char currentChar = letters.charAt(i);
            int value = currentChar - 'a' + 1; // Convert letter to corresponding value (A=1, B=2, ..., Z=26)
            result = result * 10 + value; // Combine the values for each letter
        }

        return result;
    }
}
