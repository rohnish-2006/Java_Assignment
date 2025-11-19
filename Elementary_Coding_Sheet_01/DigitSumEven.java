import java.util.Scanner;

public class DigitSumEven {
    
    public static int digitSumEven(int n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
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
        int result = digitSumEven(num);
        System.out.println("Sum of even digits: " + result);
        sc.close();
    }
}
