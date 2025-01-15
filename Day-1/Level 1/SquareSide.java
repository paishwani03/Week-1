import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Prompt user for the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate the side of the square
        double side = perimeter / 4;

        // Print the result
        System.out.println("The length of the side is " + side + 
                           " whose perimeter is " + perimeter);
	
		// Close the scanner object 
		input.close();
    }
}
