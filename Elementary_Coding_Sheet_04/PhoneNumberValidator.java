import java.util.Scanner;

public class PhoneNumberValidator {
    public static boolean isValidPhoneNumber(String phone) {
        return phone.replaceAll("[^0-9]", "").length() == 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();
        if (isValidPhoneNumber(phone)) {
            System.out.println("Phone number is valid");
        } else {
            System.out.println("Phone number is invalid");
        }
        sc.close();
    }
}
