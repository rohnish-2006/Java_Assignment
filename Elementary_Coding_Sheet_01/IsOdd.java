public class IsOdd {
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }
    
    public static void main(String[] args) {
        // Test cases
        System.out.println(isOdd(4));  // false
        System.out.println(isOdd(7));  // true
        System.out.println(isOdd(0));  // false
        System.out.println(isOdd(-3)); // true
    }
}
