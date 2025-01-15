import java.util.Scanner;

public class FeetToYardMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Conversion factors
        double feetToYards = 3;
        double yardsToMiles = 1760;

        // Convert distance to yards and miles
        double distanceInYards = distanceInFeet / feetToYards;
        double distanceInMiles = distanceInYards / yardsToMiles;

        // Print the results
        System.out.println("The distance " + distanceInFeet + " feet is " + 
                           distanceInYards + " yards and " + distanceInMiles + " miles.");
						   
		// Close the scanner object 
		input.close();
    }
}
