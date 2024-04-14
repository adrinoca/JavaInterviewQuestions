package Easy;
import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
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
        int sum = 0;
        int prevValue = 0;

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
        System.out.println(solution.romanToInt("III"));    // Output: 3
        System.out.println(solution.romanToInt("IV"));     // Output: 4
        System.out.println(solution.romanToInt("IX"));     // Output: 9
        System.out.println(solution.romanToInt("LVIII"));  // Output: 58
        System.out.println(solution.romanToInt("MCMXCIV"));// Output: 1994
    }
}