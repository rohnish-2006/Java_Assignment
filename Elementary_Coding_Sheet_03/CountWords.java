import java.util.Scanner;

public class CountWords {
    public static int countWords(String str) {
        String trimmed = str.trim();
        if (trimmed.isEmpty()) return 0;
        return trimmed.split("\\s+").length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Number of words: " + countWords(input));
        sc.close();
    }
}
