import java.util.Scanner;

class Largest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int maxDigit = 10; // Initial array size
        int[] digits = new int[maxDigit];
        int index = 0; // To track the number of digits stored

        // Extract digits from the number
        while (number != 0) {
            // Resize the array if index reaches maxDigit
            if (index == maxDigit) {
                maxDigit += 10; // Increase maxDigit by 10
                int[] temp = new int[maxDigit]; // Create a temporary array with new size

                // Copy elements from the old array to the new one
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign the new array back to digits
                digits = temp;
            }

            // Extract the last digit and add it to the array
            digits[index++] = (int) (number % 10);
            number /= 10; // Remove the last digit
        }

        // Initialize variables to store largest and second largest numbers
        int largest = -1;
        int secondLargest = -1;

        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }

        sc.close();
    }
}
