import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        System.out.println("Enter the word to be replaced:");
        String wordToReplace = scanner.nextLine();

        System.out.println("Enter the replacement word:");
        String replacementWord = scanner.nextLine();

        System.out.println("Modified sentence: " + replaceWord(sentence, wordToReplace, replacementWord));
    }

    // Function to replace a word in a sentence
    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        return sentence.replaceAll("\\b" + wordToReplace + "\\b", replacementWord);
    }
}
