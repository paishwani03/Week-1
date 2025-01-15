import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        // Prompt user for distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();

        // Conversion factor
        double conversionFactor = 1.6;

        // Convert to miles
        double miles = kilometers / conversionFactor;

        // Print the result
        System.out.println("The total miles is " + miles + " miles for the given " + kilometers + " km.");
		
		// close the scanner
		input.close();
    }
}
