// Program to divide chocolates among children
import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user inputs for the number of chocolates and children
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        System.out.print("Enter the total number of children: ");
        int numberOfChildren = input.nextInt();

        // Calculate chocolates per child and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Print the result
        System.out.println("Each child gets " + chocolatesPerChild + " chocolates and " +
                           "the remaining chocolates are " + remainingChocolates + ".");

        // Close the Scanner object
        input.close();
    }
}
