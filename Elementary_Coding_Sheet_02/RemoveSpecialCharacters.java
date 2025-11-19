import java.util.Scanner;

public class RemoveSpecialCharacters {
    public static String removeSpecialCharacters(String str) {
        return str.replaceAll("[^a-zA-Z0-9\\s]", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result = removeSpecialCharacters(input);
        System.out.println("Without special characters: " + result);
        sc.close();
    }
}
