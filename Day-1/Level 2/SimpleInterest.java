// Program to calculate Simple Interest
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user inputs for principal, rate, and time
        System.out.print("Enter the Principal amount (INR): ");
        double principal = input.nextDouble();
        System.out.print("Enter the Rate of Interest (in %): ");
        double rate = input.nextDouble();
        System.out.print("Enter the Time (in years): ");
        double time = input.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the result
        System.out.println("The Simple Interest is INR " + simpleInterest +
                           " for Principal " + principal + ", Rate of Interest " +
                           rate + "%, and Time " + time + " years.");

        // Close the Scanner object
        input.close();
    }
}
