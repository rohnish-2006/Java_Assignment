import java.util.Scanner;

public class RemoveSpaces {
    public static String removeSpaces(String str) {
        return str.replaceAll(" ", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result = removeSpaces(input);
        System.out.println("Without spaces: " + result);
        sc.close();
    }
}
