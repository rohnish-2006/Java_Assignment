import java.util.Scanner;

public class CountOddNumbers {
    public static int countOdd(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 != 0) count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Count of odd numbers: " + countOdd(numbers));
        sc.close();
    }
}
