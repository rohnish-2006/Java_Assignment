import java.util.Scanner;
import java.util.HashSet;

public class CountUniqueDigits {
    
    public static int countUniqueDigits(int n) {
        HashSet<Integer> uniqueDigits = new HashSet<>();
        n = Math.abs(n);
        if (n == 0) return 1;
        while (n > 0) {
            uniqueDigits.add(n % 10);
            n /= 10;
        }
        return uniqueDigits.size();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = countUniqueDigits(num);
        System.out.println("Unique digits: " + result);
        sc.close();
    }
}
