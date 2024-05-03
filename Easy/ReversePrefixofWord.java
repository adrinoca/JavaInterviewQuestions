package Easy;

// Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the
// index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
//
//For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3
// (inclusive). The resulting string will be "dcbaefd".
//
//Return the resulting string.

public class ReversePrefixofWord {

    public String reversePrefix(String word, char ch) {

        int limit = word.indexOf(ch);
        StringBuilder reversedPrefix = new StringBuilder();

        if (limit == -1){
            return word;
        }

        for (int i = limit; i >= 0; i--) {
            reversedPrefix.append(word.charAt(i));
        }

        for (int i = limit + 1; i < word.length(); i++) {
            reversedPrefix.append(word.charAt(i));
        }

        return reversedPrefix.toString();
    }

    public static void main(String[] args) {
        Easy.ReversePrefixofWord reversePrefixofWord = new Easy.ReversePrefixofWord();

        // Test case 1
        String word = "abcdfed";
        char ch = 'd';
        String result1 = reversePrefixofWord.reversePrefix(word, ch);
        System.out.println("Test 1 - Expected: dcbafed, Actual: " + result1);

        // Test case 2
        String word2 = "xyxzxe";
        char ch2 = 'z';
        String result2 = reversePrefixofWord.reversePrefix(word2, ch2);
        System.out.println("Test 2 - Expected: zxyxxe, Actual: " + result2);

        // Test case 3
        String word3 = "abcd";
        char ch3 = 'z';
        String result3 = reversePrefixofWord.reversePrefix(word3, ch3);
        System.out.println("Test 3 - Expected: abcd, Actual: " + result3);

    }

}
