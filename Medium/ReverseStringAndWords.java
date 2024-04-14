

class Reverse {
    public String reverseString(String sentence) {
        
        // Create a string for the result, a string for the word we construct and a
        // bolean to see if we are in the first word
        StringBuilder reversed = new StringBuilder();
        StringBuilder word = new StringBuilder();        
        boolean firstWord = true;

        for (int i = sentence.length() - 1; i >= 0; i--) {
            
            if (sentence.charAt(i) == ' ') {

                if (word.length() != 0) {

                    if (firstWord) {
                        reversed.append(word);
                        firstWord = false;
                    } else { 
                        reversed.insert(0, ' ').insert(0, word);
                    } 
                    word.setLength(0);
                }
            } else {
                word.append(sentence.charAt(i));
            }
        }

        // Adding the last word in we don't have an space
        if (word.length() > 0) {
            reversed.insert(0, ' ').insert(0, word);
        }
        return reversed.toString();
        }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.println(reverse.reverseString("Hello World"));    // Output: dlroW olleH
        System.out.println(reverse.reverseString("I want emos potatOes")); // Output: seOtatop some tnaw I
        System.out.println(reverse.reverseString("  hello world  "));
        System.out.println(reverse.reverseString("a good   example"));
    }
}