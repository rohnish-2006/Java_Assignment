import java.util.Scanner;

public class CountEvenOrOdd {
    public static void countBoth(int[] numbers) {
        int even = 0, odd = 0;
        for (int num : numbers) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        countBoth(numbers);
        sc.close();
    }
}
