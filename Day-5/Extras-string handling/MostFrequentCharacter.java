import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("Most frequent character: " + findMostFrequentCharacter(input));
    }

    // Function to find the most frequent character
    public static char findMostFrequentCharacter(String str) {
        int[] count = new int[256];
        for (char ch : str.toCharArray()) {
            count[ch]++;
        }

        int max = 0;
        char result = ' ';
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) i;
            }
        }
        return result;
    }
}
