package Easy;

public class ValidPalindrome {

    public boolean isPalindrome (String s) {

        String clean = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                clean += Character.toLowerCase(c);
            }
        }

        for (int i = 0, j = clean.length() - 1; i < (clean.length() / 2); i++, j--) {
            if (clean.charAt(i) != clean.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome validator = new ValidPalindrome();

        // Caso de prueba 1
        String test1 = "A man, a plan, a canal: Panama";
        boolean result1 = validator.isPalindrome(test1);
        System.out.println("Test 1 - Expected: true, Actual: " + result1);
        assert result1 : "Test 1 failed";

        // Caso de prueba 2
        String test2 = "race a car";
        boolean result2 = validator.isPalindrome(test2);
        System.out.println("Test 2 - Expected: false, Actual: " + result2);
        assert !result2 : "Test 2 failed";

        // Caso de prueba 3
        String test3 = " ";
        boolean result3 = validator.isPalindrome(test3);
        System.out.println("Test 3 - Expected: true, Actual: " + result3);
        assert result3 : "Test 3 failed";
    }

}
