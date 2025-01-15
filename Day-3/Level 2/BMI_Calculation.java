import java.util.Scanner;

class MultiDimensionalBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int num = sc.nextInt();

        double[][] personData = new double[num][3]; // Stores weight, height, BMI
        String[] weightStatus = new String[num];

        // Input weight and height
        for (int i = 0; i < num; i++) {
            System.out.println("Enter weight (kg) and height (m) for person " + (i + 1) + ":");
            double weight = sc.nextDouble();
            double height = sc.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--; // Re-enter data
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = weight / (height * height); // BMI calculation

            // Determine weight status
            double bmi = personData[i][2];
            if (bmi <= 18.4) weightStatus[i] = "Underweight";
            else if (bmi <= 24.9) weightStatus[i] = "Normal";
            else if (bmi <= 39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        // Display data
        System.out.println("Height (m) | Weight (kg) | BMI     |  Weight Status");
        for (int i = 0; i < num; i++) {
            System.out.printf("%.2f         %.2f         %.2f      %s%n",
                    personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
