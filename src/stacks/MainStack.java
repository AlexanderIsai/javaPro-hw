package stacks;

import java.util.Stack;

public class MainStack {

    public static void main(String[] args) {

        String string = "евирпим ,тр";
        int secret = 5;
        encryption(string, secret);
    }

    public static void encryption(String str, int secret) {
        Stack<Character> characterStack = new Stack<>();
        int fullWord = str.length() / secret;
        if (str.length() % secret != 0) {
            fullWord++;
        }
        String[] strings = new String[fullWord];
        int i = 0;
        for (int j = 0; j < strings.length; j++) {
            if ((i + secret) > str.length()) {
                strings[strings.length - 1] = str.substring((fullWord - 1) * secret);
            } else {
                strings[j] = str.substring(i, i += secret);
            }
        }
        for (String string : strings) {
            for (int n = 0; n < string.length(); n++) {
                characterStack.push(string.charAt(n));
            }
            for (int k = 0; k < secret; k++) {
                if (!characterStack.isEmpty()) {
                    System.out.print(characterStack.pop());
                }
            }
        }
    }
}
