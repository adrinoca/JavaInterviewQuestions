package Easy;

class Reverse {
    public String reverseString(String sentence) {
        
        String reversed = "";

        for (int i = (sentence.length() - 1); i >= 0; i--) {

            char letter = sentence.charAt(i);
            reversed = reversed + letter;

        } return reversed;
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.println(reverse.reverseString("Hello World"));    // Output: dlroW olleH
        System.out.println(reverse.reverseString("I want emos potatOes")); // Output: seOtatop some tnaw I
    }
}