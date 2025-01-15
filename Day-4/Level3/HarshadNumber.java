import java.util.Arrays;

public class HarshadNumber {

    // Method to count the number of digits in a number
    public static int countDigits(int number) {
        int count = 0;
        number = Math.abs(number);
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store the digits of the number in an array
    public static int[] getDigitsArray(int number) {
        number = Math.abs(number);
        int length = countDigits(number);
        int[] digits = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number > 0 && number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int number) {
        int[] digits = getDigitsArray(number);
        int[][] frequency = new int[10][2];

        // Initialize the frequency array
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        // Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        int number = 12321;

        // Count digits
        System.out.println("Count of digits: " + countDigits(number));

        // Store digits in an array
        int[] digitsArray = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));

        // Sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(number));

        // Sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));

        // Check if Harshad number
        System.out.println("Is Harshad number: " + isHarshadNumber(number));

        // Frequency of each digit
        int[][] frequency = digitFrequency(number);
        System.out.println("Digit frequencies:");
        for (int[] freq : frequency) {
            if (freq[1] > 0) {
                System.out.println("Digit: " + freq[0] + ", Frequency: " + freq[1]);
            }
        }
    }
}
