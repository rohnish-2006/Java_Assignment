public class UserIDGeneration {
    public static String generateUserID(String firstName, String lastName, int pin) {
        String id = firstName.substring(0, Math.min(3, firstName.length())).toUpperCase();
        id += lastName.substring(0, Math.min(3, lastName.length())).toUpperCase();
        id += String.format("%04d", pin);
        return id;
    }
    
    public static void main(String[] args) {
        System.out.println(generateUserID("John", "Doe", 123));    // JOHDOE0123
        System.out.println(generateUserID("Alice", "Smith", 456)); // ALISMI0456
        System.out.println(generateUserID("Bob", "Lee", 789));     // BOBLEE0789
    }
}
