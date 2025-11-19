import java.util.Scanner;

public class CreditCardValidator {
    public static boolean isValidCreditCard(String card) {
        return card.replaceAll(" ", "").length() == 16 && card.replaceAll("[^0-9 ]", "").length() == 16;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        String card = sc.nextLine();
        if (isValidCreditCard(card)) {
            System.out.println("Credit card is valid");
        } else {
            System.out.println("Credit card is invalid");
        }
        sc.close();
    }
}
