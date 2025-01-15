import java.util.Scanner;

class TrigonometricCalculator {
    // Method to calculate sine, cosine, and tangent of an angle
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric functions
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return results as an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrigonometricCalculator obj = new TrigonometricCalculator();

        System.out.print("Enter an angle in degrees: ");
        double angle = sc.nextDouble();

        // Calculate trigonometric functions
        double[] results = obj.calculateTrigonometricFunctions(angle);

        // Display results
        System.out.printf("For the angle %.2f degrees:%n", angle);
        System.out.printf("Sine: %.4f%n", results[0]);
        System.out.printf("Cosine: %.4f%n", results[1]);
        System.out.printf("Tangent: %.4f%n", results[2]);
    }
}
