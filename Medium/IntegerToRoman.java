class Solution {
    public String intToRoman(int num) {
        // Roman numerals components
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        // Build the Roman numeral string from the highest place values to the lowest
        return thousands[num / 1000] +
               hundreds[(num % 1000) / 100] +
               tens[(num % 100) / 10] +
               ones[num % 10];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.intToRoman(3));    // Output: "III"
        System.out.println(solution.intToRoman(58));     // Output: "LVIII"
        System.out.println(solution.intToRoman(1994));     // Output: "MCMXCIV"
    }
}