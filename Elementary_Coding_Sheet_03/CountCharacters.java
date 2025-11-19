import java.util.Scanner;

public class CountCharacters {
    public static int countCharacters(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Number of characters: " + countCharacters(input));
        sc.close();
    }
}
