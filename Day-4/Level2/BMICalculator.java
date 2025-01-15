import java.util.Scanner;

class BMICalculator {
    // Method to calculate BMI
    public double calculateBMI(double weight, double heightInCm) {
        double heightInMeters = heightInCm / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }

    // Method to determine BMI status
    public String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        if (bmi <= 39.9) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BMICalculator obj = new BMICalculator();
        double[][] data = new double[10][3]; // Array to store weight, height, and BMI

        // Input weight and height for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();

            // Calculate BMI
            data[i][2] = obj.calculateBMI(data[i][0], data[i][1]);
        }

        // Display results
        System.out.println("\nBMI Results:");
        for (int i = 0; i < 10; i++) {
            String status = obj.getBMIStatus(data[i][2]);
            System.out.printf("Person %d - Weight: %.2f kg, Height: %.2f cm, BMI: %.2f, Status: %s%n",
                              i + 1, data[i][0], data[i][1], data[i][2], status);
        }
    }
}
