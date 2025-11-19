import java.util.Scanner;

public class ReturnSecondLastDigit {
    public static int returnSecondLastDigit(int n) {
        n = Math.abs(n);
        return (n / 10) % 10;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Second last digit: " + returnSecondLastDigit(n));
        sc.close();
    }
}
