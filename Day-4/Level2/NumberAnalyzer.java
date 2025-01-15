import java.util.Scanner;

class NumberAnalyzer {
    // Method to check if a number is positive
    public boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public int compare(int num1, int num2) {
        return Integer.compare(num1, num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        NumberAnalyzer obj = new NumberAnalyzer();

        // Input numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Analyze each number
        for (int number : numbers) {
            if (obj.isPositive(number)) {
                System.out.println(number + " is Positive");
                System.out.println(number + " is " + (obj.isEven(number) ? "Even" : "Odd"));
            } else {
                System.out.println(number + " is Negative");
            }
        }

        // Compare first and last elements
        int comparison = obj.compare(numbers[0], numbers[numbers.length - 1]);
        if (comparison > 0) {
            System.out.println("First number is greater than the last number.");
        } else if (comparison < 0) {
            System.out.println("First number is less than the last number.");
        } else {
            System.out.println("First number is equal to the last number.");
        }
    }
}
