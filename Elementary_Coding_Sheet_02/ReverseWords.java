import java.util.Scanner;

public class ReverseWords {
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result = reverseWords(input);
        System.out.println("Reversed words: " + result);
        sc.close();
    }
}
