public class ReturnLastDigit {
    public static int returnLastDigit(int n) {
        return Math.abs(n) % 10;
    }
    
    public static void main(String[] args) {
        // Test cases
        System.out.println(returnLastDigit(1234));  // 4
        System.out.println(returnLastDigit(567));   // 7
        System.out.println(returnLastDigit(0));     // 0
        System.out.println(returnLastDigit(-89));   // 9
    }
}
