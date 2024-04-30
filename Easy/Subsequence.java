package Easy;

public class Subsequence {

    public boolean isSubsequence (String s, String t) {

        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        } return i == s.length();
    }

    public static void main(String[] args) {
        Easy.Subsequence subsequence = new Easy.Subsequence();

        // Caso de prueba 1
        String s1 = "abc";
        String t1 = "ahbgdc";
        boolean result1 = subsequence.isSubsequence(s1, t1);
        System.out.println("Test 1 - Expected: true, Actual: " + result1);
        assert result1 : "Test 1 failed";

        // Caso de prueba 2
        String s2 = "axc";
        String t2 = "ahbgdc";
        boolean result2 = subsequence.isSubsequence(s2, t2);
        System.out.println("Test 2 - Expected: false, Actual: " + result2);
        assert result2 : "Test 2 failed";

    }

}