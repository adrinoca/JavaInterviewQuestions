package Easy;

class ReverseString {

    public static char[] reverseString (char[] s) {

        int n = s.length;

        for (int i = 0, j = n - 1; i < n / 2; i++, j--) {

            char temp = s[i];

            // Replace character at index i with the one in index j
            s[i] = s[j];

            // Replace character at index j with the one in index i
            s[j] = temp;

        } return s;

    }
    
    public static void main (String[] args) {
        ReverseString reverseString = new ReverseString();
        char[] s = {'h', 'e', 'l'};
        System.out.println(reverseString.reverseString(s)); // Output leh
    }

}
