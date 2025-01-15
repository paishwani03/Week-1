import java.util.Scanner;

class ValidAge{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare an array to store the ages of 10 students
        int[] ages = new int[10];

        // Input the ages of the students
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt(); // Store user input in the array
        }

        // Check voting eligibility for each student
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                // If age is negative, print an error message
                System.out.println("Invalid age: " + ages[i]);
            } else if (ages[i] >= 18) {
                // If age is 18 or above, the student can vote
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                // If age is below 18, the student cannot vote
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        // Close the Scanner object
        input.close();
    }
}
