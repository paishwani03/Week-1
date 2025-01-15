import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Points are collinear if all slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using area of a triangle formula
    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // Points are collinear if the area is 0
        return area == 0.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three points
        System.out.print("Enter x1, y1 for point A: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2, y2 for point B: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.print("Enter x3, y3 for point C: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Check collinearity using slope formula
        boolean collinearSlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);

        // Check collinearity using area of triangle formula
        boolean collinearArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        // Display results
        System.out.println("Using slope formula, points are collinear: " + collinearSlope);
        System.out.println("Using area formula, points are collinear: " + collinearArea);

        scanner.close();
    }
}
