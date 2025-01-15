import java.util.Scanner;

class TriangularPark {
    // Method to calculate the number of rounds 
    public int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; // Calculate the perimeter of the triangle
        return (int) Math.ceil(5000 / perimeter); // Calculate the number of rounds (5000 meters = 5 km)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user for the three sides of the triangular park
        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Create an object 
        TriangularPark calculator = new TriangularPark();

        // Calculate the number of rounds
        int rounds = calculator.calculateRounds(side1, side2, side3);

        // Display the result
        System.out.println("The athlete must complete " + rounds + " rounds to cover 5 km.");
    }
}
