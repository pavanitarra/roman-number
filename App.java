import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        // Create a HashMap to store the Roman numeral symbols and their corresponding integer values
        HashMap<Character, Integer> romanNumeralMap = new HashMap<>();
        romanNumeralMap.put('I', 1);
        romanNumeralMap.put('V', 5);
        romanNumeralMap.put('X', 10);
        romanNumeralMap.put('L', 50);
        romanNumeralMap.put('C', 100);
        romanNumeralMap.put('D', 500);
        romanNumeralMap.put('M', 1000);

        // Create a Scanner object to read the Roman numeral from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();

        // Convert the Roman numeral to an integer
        int integerValue = 0;
        int previousValue = 0;
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currentValue = romanNumeralMap.get(romanNumeral.charAt(i));
            if (currentValue < previousValue) {
                integerValue -= currentValue;
            } else {
                integerValue += currentValue;
            }
            previousValue = currentValue;
        }

        // Print the integer value
        System.out.println("The integer value of the Roman numeral is: " + integerValue);
    }
}