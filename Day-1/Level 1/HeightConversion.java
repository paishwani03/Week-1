import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // Prompt user for height in cm
        System.out.print("Enter height in centimeters: ");
        double height = sc.nextDouble();

        // Conversion factors
        double cmToInch = 2.54;
        int inchToFeet = 12;

        // Convert height to inches
        double totalInches = height / cmToInch;

        // Calculate feet and remaining inches
        int feet = (int) totalInches / inchToFeet;
        double inches = totalInches % inchToFeet;

        // Print results
        System.out.println("Your height in cm is " + height + 
                           " while in feet is " + feet + " and inches is " + inches);
		// Close the scanner object 
		sc.close();
    }
}
