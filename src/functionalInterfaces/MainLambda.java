package functionalInterfaces;

import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MainLambda {

    public static void main(String[] args) {

//1) Functional. Принимает строку, а отдает ее размер
        Function<String, Integer> function = (string) -> string.length();
        System.out.println(function.apply("qwerty"));

//2) BinaryOperator - принимает две строки, отдает строку - результат сложения двух строк
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("qwe", "rty"));

//3) Supplier. Ничего не принимает, отдает случайно сгенерированное число
        Supplier<Integer> supplier = () -> new Random().nextInt();
        System.out.println(supplier.get());

//4) Consumer. Принимает число, пишет на экран "привет" количество раз, равное числу
        Consumer<Integer> consumer = (n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println("привет");
            }
        };
        consumer.accept(5);
    }
}

