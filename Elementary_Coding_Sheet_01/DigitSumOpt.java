import java.util.Scanner;

public class DigitSumOpt {
    
    public static int digitSumOpt(int n, int option) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            int digit = n % 10;
            if (option == 0 && digit % 2 == 0) {
                sum += digit;
            } else if (option == 1 && digit % 2 != 0) {
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter option (0 for even, 1 for odd): ");
        int opt = sc.nextInt();
        int result = digitSumOpt(num, opt);
        System.out.println("Sum: " + result);
        sc.close();
    }
}
