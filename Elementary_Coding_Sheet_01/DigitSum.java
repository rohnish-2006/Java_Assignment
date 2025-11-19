import java.util.Scanner;

public class DigitSum {
    
    public static int digitSum(int n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = digitSum(num);
        System.out.println("Sum of all digits: " + result);
        sc.close();
    }
}
