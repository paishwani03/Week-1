// Program to calculate total income
import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for salary and bonus
        System.out.print("Enter the salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter the bonus: ");
        double bonus = input.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + 
                           ". Hence Total Income is INR " + totalIncome);

        // Close the Scanner object
        input.close();
    }
}
