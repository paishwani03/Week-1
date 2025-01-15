import java.util.Scanner;

class NumberCheck {
    // Method to check whether a number is positive, negative, or zero
    public int checkNumber(int number) {
        if (number > 0) return 1;  
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Create an object 
        NumberCheck checker = new NumberCheck();

         int result = checker.checkNumber(number);

        // Display the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
