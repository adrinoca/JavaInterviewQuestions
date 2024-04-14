import java.util.HashMap;

class Solution {
    public String intToRoman(int num) {
        // Create HasMap with Roman Numbers
        HashMap<Character, Integer> romanNumbers = new HashMap<>();

        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);

        // Variables
        char numer = 'I';

        // Iterate over the string of Roman Numbers
        for (int i = 0; i < s.length(); i++) {

            char currentChar = s.charAt(i);
            int currentValue = romanNumbers.get(currentChar);

            // If the previous value is smaller than the current value we
            // have to substract to times it from the total sum.
            if (prevValue < currentValue) {
                sum -= 2 * prevValue;
            }

            sum += currentValue;
            prevValue = currentValue;

        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.intToRoman(3));    // Output: III
        System.out.println(solution.intToRoman(58));     // Output: LVIII
        System.out.println(solution.intToRoman(1994));     // Output: MCMXCIV
    }
}