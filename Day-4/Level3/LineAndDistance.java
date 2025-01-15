import java.util.Scanner;

public class LineAndDistance {

    // Method to calculate the Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the slope (m) and y-intercept (b) of the line
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1); // Slope m
        double yIntercept = y1 - (slope * x1); // Intercept b
        return new double[]{slope, yIntercept}; // Return slope and y-intercept
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for two points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("The Euclidean distance between the two points is: %.2f%n", distance);

        // Calculate the line equation
        if (x1 == x2) {
            // Handle the case of a vertical line
            System.out.println("The line is vertical, and the equation is x = " + x1);
        } else {
            double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
            double slope = lineEquation[0];
            double yIntercept = lineEquation[1];
            System.out.printf("The equation of the line is: y = %.2f*x + %.2f%n", slope, yIntercept);
        }

        scanner.close();
    }
}
