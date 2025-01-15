import java.util.Scanner;

class Quadratic {
    // Method to find roots of the quadratic equation
    public double[] findRoots(double a, double b, double c) {
        double delta = (b * b) - (4 * a * c);
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[]{}; // No real roots
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quadratic obj = new Quadratic();

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // Find and display roots
        double[] roots = obj.findRoots(a, b, c);
        if (roots.length == 2) {
            System.out.printf("The roots are: %.2f and %.2f%n", roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("There is one root: %.2f%n", roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }
    }
}
