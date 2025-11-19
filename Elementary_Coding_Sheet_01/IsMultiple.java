import java.util.Scanner;

public class IsMultiple {
    public static boolean isMultiple(int n, int m) {
        if (m == 0) return false;
        return n % m == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.print("Enter M: ");
        int m = sc.nextInt();
        System.out.println("Is " + n + " a multiple of " + m + "? " + isMultiple(n, m));
        sc.close();
    }
}
