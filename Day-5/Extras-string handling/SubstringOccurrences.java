import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();

        System.out.println("Enter the substring to count:");
        String substring = scanner.nextLine();

        System.out.println("Occurrences: " + countOccurrences(mainString, substring));
    }

    // Function to count substring occurrences
    public static int countOccurrences(String str, String sub) {
        int count = 0, index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }
}
