import java.util.Scanner;

class StoreValues {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare an array to store up to 10 numbers
        double[] numbers = new double[10];
        double total = 0.0; // To store the total sum
        int index = 0; // To track the number of elements

        // Use a loop to get user input until the array is full or the user enters 0/negative number
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();

            // Break if the number is 0 or negative or if the array is full
            if (num <= 0 || index == 10)
			break;

            // Store the number in the array
            numbers[index++] = num;
        }

        // Calculate the total and display the numbers
        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            total += numbers[i];
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nTotal: " + total);

        // Close the Scanner object
        input.close();
    }
}
