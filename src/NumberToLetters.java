import java.util.Scanner;

public class NumberToLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
            String result = convertToLetters(inputNumber);
            System.out.println(result);
        }

        static String convertToLetters(int number) {
            StringBuilder result = new StringBuilder();

            while (number > 0) {
                int digit = number % 100;
                if (digit > 0 && digit <= 26) {
                    // Convert digit to corresponding letter (A=1, B=2, ..., Z=26)
                    char letter = (char) ('A' + digit - 1);
                    result.insert(0, letter);
                }
                number /= 100;
            }

            return result.toString();
        }
    }