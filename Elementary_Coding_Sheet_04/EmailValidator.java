import java.util.Scanner;

public class EmailValidator {
    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".") && email.indexOf("@") < email.lastIndexOf(".");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        if (isValidEmail(email)) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
        sc.close();
    }
}
