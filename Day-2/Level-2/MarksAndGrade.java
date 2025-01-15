// Create MarksAndGrade class to calculate percentage and determine grade
import java.util.Scanner;

class MarksAndGrade {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter marks for three subjects
        System.out.print("Enter marks for Physics: ");
        int physics = input.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = input.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = input.nextInt();

        // Calculate the total marks and percentage
        int totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3.0;

        // Determine the grade based on the percentage
        char grade;
        if (percentage >= 80) {
            grade = 'A';
        } else if (percentage >= 70) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 50) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'R';
        }

        // Display the results
        System.out.println("Average Marks: " + percentage + "%");
        System.out.println("Grade: " + grade);

        // Close the Scanner object to release resources
        input.close();
    }
}
