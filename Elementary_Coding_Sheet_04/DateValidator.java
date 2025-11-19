DateValidator.java  import java.util.Scanner;

public class DateValidator {
    public static boolean isValidDate(String date) {
        String[] parts = date.split("/");
        if (parts.length != 3) return false;
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        return day >= 1 && day <= 31 && month >= 1 && month <= 12 && year > 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (dd/mm/yyyy): ");
        String date = sc.nextLine();
        if (isValidDate(date)) {
            System.out.println("Date is valid");
        } else {
            System.out.println("Date is invalid");
        }
        sc.close();
    }
}
