import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams of each other.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase for comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not the same, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert to character arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
