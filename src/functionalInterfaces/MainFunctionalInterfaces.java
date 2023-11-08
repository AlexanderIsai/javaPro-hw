package functionalInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

//1) Functional. Принимает строку, находит в ней самый часто встречаемый символ и отдает ее
public class MainFunctionalInterfaces {

    public static void main(String[] args) {

        Supplier<String> supplier = MainFunctionalInterfaces::getRandomString;
        Function<String, Character> function = (string) -> getPopularChar(string);
        System.out.println(function.apply(supplier.get()));
    }

    public static Character getPopularChar(String str) {
        System.out.println(str);
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int maxValue = Integer.MIN_VALUE;
        char maxKey = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!hashMap.containsKey(str.charAt(i))) {
                hashMap.put(str.charAt(i), 1);
            } else {
                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
            }
        }
        System.out.println(hashMap);
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.print(maxValue + " - ");
        return maxKey;
    }

    public static String getRandomString() {
        Random random = new Random();
        String alphabet = "qwertyuiopasdfghjklzxcvbnm ";
        StringBuilder stringBuilder = new StringBuilder();
        int stringLength = random.nextInt(100);
        for (int i = 0; i < stringLength; i++) {
            stringBuilder.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        return stringBuilder.toString();
    }
}
