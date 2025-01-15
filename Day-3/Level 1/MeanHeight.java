import java.util.Scanner;

class MeanHeight {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare an array to store the heights of 11 players
        double[] heights = new double[11];

        // Input the heights of players
        System.out.println("Enter the heights of 11 players (in cm):");
        for (int i = 0; i < 11; i++) {
            heights[i] = input.nextDouble();
        }

        // Calculate the sum of all heights
        double sum = 0.0;
        for (double height : heights) {
            sum += height; // Add each height to the sum
        }

        // Calculate the mean height
        double mean = sum / 11;

        // Display the mean height
        System.out.println("The mean height of the football team is: " + mean + " cm");

        // Close the Scanner object
        input.close();
    }
}
