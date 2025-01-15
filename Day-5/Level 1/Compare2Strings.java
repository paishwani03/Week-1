import java.util.Scanner;

public class Compare2Strings {
    
    // Method to compare two strings using charAt()
    static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Strings of different lengths are not equal
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for two strings
        System.out.print("Enter string 1: ");
        String str1 = sc.next(); 
		
        System.out.print("Enter string 2: ");
        String str2 = sc.next();

        // Compare using charAt()
        boolean resultCharAt = compareUsingCharAt(str1, str2);
        
        // Compare using equals()
        boolean resultEquals = str1.equals(str2);

        // Display results
        System.out.println("Result using charAt() method: " + resultCharAt);
        System.out.println("Result using equals() method: " + resultEquals);

        // Check if results match
        if (resultCharAt == resultEquals) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Methods give different results.");
        }
    }
}
