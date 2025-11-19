import java.util.Scanner;
import java.util.HashMap;

public class CountNonRepeatedDigits {
    
    public static int countNonRepeatedDigits(int n) {
        HashMap<Integer, Integer> digitCount = new HashMap<>();
        n = Math.abs(n);
        if (n == 0) return 1;
        
        while (n > 0) {
            int digit = n % 10;
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
            n /= 10;
        }
        
        int count = 0;
        for (int freq : digitCount.values()) {
            if (freq == 1) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = countNonRepeatedDigits(num);
        System.out.println("Non-repeated digits: " + result);
        sc.close();
    }
}
