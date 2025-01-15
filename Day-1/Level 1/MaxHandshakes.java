// Program to find the maximum number of handshakes among students
import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate the maximum number of handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Print the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents +
                           " students is " + maxHandshakes);
						   
		// Close the scanner object 
		input.close();
    }
}
