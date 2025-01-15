import java.util.Scanner;

class SmallestLargest{
    // Method to find the smallest and largest numbers among three numbers
    public int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest}; // Return both values as an array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user for three numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        // Create an object of the SmallestLargest class
        SmallestLargest obj = new SmallestLargest();

        // Find the smallest and largest numbers
        int[] result = obj.findSmallestAndLargest(number1, number2, number3);

        // Display the result
        System.out.println("The smallest number is " + result[0] + " and the largest number is " + result[1] + ".");
    }
}
