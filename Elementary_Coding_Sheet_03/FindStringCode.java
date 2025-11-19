public class FindStringCode {
    public static int findStringCode(String str) {
        if (str == null || str.isEmpty()) return 0;
        
        int code = 0;
        for (int i = 0; i < str.length(); i++) {
            code += str.charAt(i);
        }
        return code;
    }
    
    public static void main(String[] args) {
        System.out.println(findStringCode("abc"));    // 294
        System.out.println(findStringCode("Hello")); // 500
        System.out.println(findStringCode(""));      // 0
    }
}
