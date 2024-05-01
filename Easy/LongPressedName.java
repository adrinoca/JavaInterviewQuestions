package Easy;

//Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed,
// and the character will be typed 1 or more times.
//
//You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with
// some characters (possibly none) being long pressed.

public class LongPressedName {

    public boolean isLongPressedName(String name, String typed) {

        int i = 0, j = 0;

        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
            } else {
                if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
                    return false;
                }
            }
            j++;
        }

        return i == name.length();

    }

    public static void main(String[] args) {
        Easy.LongPressedName isLongPressedName = new Easy.LongPressedName();

        // Test case 1
        String name1 = "alex";
        String typed1 = "aaleex";
        boolean result1 = isLongPressedName.isLongPressedName(name1, typed1);
        System.out.println("Test 1 - Expected: true, Actual: " + result1);

        // Test case 2
        String name2 = "saeed";
        String typed2 = "ssaaedd";
        boolean result2 = isLongPressedName.isLongPressedName(name2, typed2);
        System.out.println("Test 1 - Expected: false, Actual: " + result2);

    }

}
