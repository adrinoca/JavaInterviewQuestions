class ReverseInteger {
    public int reverse(int x) {
        
        String numberToString = Integer.toString(x);
        StringBuilder reverse = new StringBuilder();
        boolean isNegative = x < 0;

        int endIndex = isNegative ? 1 : 0;

        for (int i = numberToString.length() -1; i >= endIndex; i--) {
            char val = numberToString.charAt(i);
            reverse.append(val);
        }

        int reversedNumber = Integer.parseInt(reverse.toString());

    return isNegative ? -reversedNumber : reversedNumber; 
    }

    public static void main (String [] args) {
        ReverseInteger reverse = new ReverseInteger();
        System.out.println(reverse.reverse(321));    // Output: 123
        System.out.println(reverse.reverse(445592));  // Output: 295544 
        System.out.println(reverse.reverse(-123));  // Output: -321          
    }

}