import java.util.Scanner;

public class ConvertToLowerCase {
    
    public static String convertToLowerCase(String str) {
        return str.toLowerCase();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result = convertToLowerCase(input);
        System.out.println("Lowercase: " + result);
        sc.close();
    }
}
