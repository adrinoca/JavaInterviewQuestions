
class ReverseString {
    public String reverseString(String sentence) {
        
        // Create a string for the result, a string for the word we construct and a
        // bolean to see if we are in the first word
        StringBuilder reversedSentence = new StringBuilder();
        StringBuilder word = new StringBuilder();
        boolean firstWord = true;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch == ' ') {
                if (word.length() > 0) {  // Solo añade si 'word' no está vacía
                    if (firstWord) {
                        reversedSentence.append(word);
                        firstWord = false;
                    } else {
                        reversedSentence.insert(0, ' ').insert(0, word);
                    }
                    word.setLength(0);  // Resetear 'word' después de añadir al resultado
                }
            } else {
                word.append(ch);
            }
        }

        if (word.length() > 0) {  // Para añadir la última palabra si no hay espacio al final
            if (firstWord) {
                reversedSentence.append(word);
            } else {
                reversedSentence.insert(0, ' ').insert(0, word);
            }
        }

        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        ReverseString reverse = new ReverseString();
        System.out.println(reverse.reverseString("Hello World"));           // Output: World Hello
        System.out.println(reverse.reverseString("I want emos potatOes"));  // Output: potatOes emos want I
        System.out.println(reverse.reverseString("a good   example"));      // Output: example good a
        System.out.println(reverse.reverseString("EPY2giL"));               // Output: EPY2giL
    }
}