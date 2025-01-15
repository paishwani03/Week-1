// Create BonusCalculation class to calculate the bonus based on years of service
import java.util.Scanner;

class Bonus {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get salary and years of service from the user
        System.out.print("Enter the employee's salary: ");
        double salary = input.nextDouble();
        
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = input.nextInt();

        // Check if years of service is greater than 5 to calculate bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05; // 5% bonus for employees with more than 5 years of service
            System.out.println("The bonus is: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }

        // Close the Scanner stream
        input.close();
    }
}
