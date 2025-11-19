public class IsPalindromeNumber {
    public static boolean isPalindrome(int n) {
        if (n < 0) return false;
        int original = n;
        int reversed = 0;
        
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        
        return original == reversed;
    }
    
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));   // true
        System.out.println(isPalindrome(12321)); // true
        System.out.println(isPalindrome(123));   // false
        System.out.println(isPalindrome(-121));  // false
    }
}
