import java.util.Scanner;

public class URLValidator {
    public static boolean isValidURL(String url) {
        return url.startsWith("http://") || url.startsWith("https://");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String url = sc.nextLine();
        if (isValidURL(url)) {
            System.out.println("URL is valid");
        } else {
            System.out.println("URL is invalid");
        }
        sc.close();
    }
}
