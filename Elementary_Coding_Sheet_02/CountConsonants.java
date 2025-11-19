import java.util.Scanner;

public class CountConsonants {
    
    public static int countConsonants(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int consonants = countConsonants(input);
        System.out.println("Number of consonants: " + consonants);
        sc.close();
    }
}
