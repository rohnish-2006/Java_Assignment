import java.util.Scanner;

public class SumOfLastDigitsOfTwoNumbers {
    public static int sumOfLastDigits(int a, int b) {
        int lastA = Math.abs(a) % 10;
        int lastB = Math.abs(b) % 10;
        return lastA + lastB;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum of last digits: " + sumOfLastDigits(a, b));
        sc.close();
    }
}
