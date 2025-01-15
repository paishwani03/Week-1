import java.util.Scanner;

class FriendsDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[3];
        int[] heights = new int[3];

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age and height for friend " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            heights[i] = sc.nextInt();
        }

        // Find youngest and tallest
        int youngest = 0, tallest = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngest])
				youngest = i;
            if (heights[i] > heights[tallest]) 
				tallest = i;
        }

        // Display results
        System.out.println("Youngest Friend: Friend " + (youngest + 1) + " (Age: " + ages[youngest] + ")");
        System.out.println("Tallest Friend: Friend " + (tallest + 1) + " (Height: " + heights[tallest] + ")");

        sc.close();
    }
}
