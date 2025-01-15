import java.util.Random;

public class FootballTeam {

    // Method to calculate mean height
    public static double calculateMean(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int h : heights) {
            if (h < shortest) {
                shortest = h;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int h : heights) {
            if (h > tallest) {
                tallest = h;
            }
        }
        return tallest;
    }

    // Main method
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random obj = new Random(); // Random object named obj

        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = obj.nextInt(101) + 150; // Random height between 150-250
        }

        System.out.println("Player Heights: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("\nMean Height: " + calculateMean(heights));
        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
    }
}
