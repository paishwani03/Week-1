import java.util.Scanner;

class FriendsAnalyzer {
    // Method to find the youngest friend's index
    public int findYoungest(int[] ages) {
        int minAge = ages[0], index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return index;
    }

    // Method to find the tallest friend's index
    public int findTallest(double[] heights) {
        double maxHeight = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Analyze data
        FriendsAnalyzer obj = new FriendsAnalyzer();
        int youngestIndex = obj.findYoungest(ages);
        int tallestIndex = obj.findTallest(heights);

        // Display results
        System.out.println("\nThe youngest friend is " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("The tallest friend is " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");
    }
}
