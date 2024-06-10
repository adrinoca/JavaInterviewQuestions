package Easy;

// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with
// word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
//
//Return the merged string.
//
//Example 1:
//
//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
//Explanation: The merged string will be merged as so:
//word1:  a   b   c
//word2:    p   q   r
//merged: a p b q c r
//Example 2:
//
//Input: word1 = "ab", word2 = "pqrs"
//Output: "apbqrs"
//Explanation: Notice that as word2 is longer, "rs" is appended to the end.
//word1:  a   b
//word2:    p   q   r   s
//merged: a p b q   r   s
//Example 3:
//
//Input: word1 = "abcd", word2 = "pq"
//Output: "apbqcd"
//Explanation: Notice that as word1 is longer, "cd" is appended to the end.
//word1:  a   b   c   d
//word2:    p   q
//merged: a p b q c   d

public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder merged = new StringBuilder();
        int m = word1.length(), n = word2.length();
        int i = 0, j = 0;

        while (i < m || j < n){
            if (i < m) {
                merged.append(word1.charAt(i));
            }
            if (j < n) {
                merged.append(word2.charAt(j));
            }
            i++;
            j++;
        }
        return merged.toString();
    }

    public static void main (String[] args) {
        // Test case 1
        String word11 = "abc";
        String word12 = "pqr";
        String result1 = MergeStringsAlternately.mergeAlternately(word11, word12);
        System.out.println("Test 1 - Expected: apbqcr, Actual: " + result1);

        // Test case 2
        String word21 = "ab";
        String word22 = "pqrs";
        String result2 = MergeStringsAlternately.mergeAlternately(word21, word22);
        System.out.println("Test 1 - Expected: apbqrs, Actual: " + result2);

        // Test case 3
        String word31 = "abcd";
        String word32 = "pq";
        String result3 = MergeStringsAlternately.mergeAlternately(word31, word32);
        System.out.println("Test 1 - Expected: apbqcd, Actual: " + result3);

    }

}

// COMPLEXITY
// TIME
// We run over the strings one time. O(m + n).
//
// SPACE
// We use new space in the memory. O(m + n).
