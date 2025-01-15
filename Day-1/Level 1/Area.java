import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for base and height
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();

        // Calculate the area
        double area = 0.5 * base * height;

        // Print the result
        System.out.println("The area of the triangle is " + area + " square units.");
		
		// Close the scanner object 
		input.close();
    }
}
