import java.util.Scanner;

class Handshakes {
    // Method to calculate the maximum number of handshakes using the combination formula
    public int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Create an object of the HandshakeCalculator class
        Handshakes obj = new Handshakes();

        // Calculate the maximum number of handshakes
        int handshakes = obj.calculateHandshakes(numberOfStudents);

        // Display the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents +
                           " students is " + handshakes + ".");
    }
}
