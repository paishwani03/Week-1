import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = sc.nextInt();

        // 2D Array to store weight, height, and BMI
        double[][] personData = new double[numberOfPersons][3]; 
        String[] weightStatus = new String[numberOfPersons]; // Array to store weight status

        // Input weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");

            // Input and validate weight
            while (true) {
                System.out.print("Enter weight (in kg): ");
                double weight = sc.nextDouble();
                if (weight > 0) {
                    personData[i][0] = weight;
                    break;
                } else {
                    System.out.println("Invalid input! Weight must be positive.");
                }
            }

            // Input and validate height
            while (true) {
                System.out.print("Enter height (in meters): ");
                double height = sc.nextDouble();
                if (height > 0) {
                    personData[i][1] = height;
                    break;
                } else {
                    System.out.println("Invalid input! Height must be positive.");
                }
            }

            // Calculate BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status based on BMI
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("Person | Weight (kg) | Height (m) |    BMI    | Weight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%6d | %11.2f | %9.2f | %8.2f   |   %s%n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
