package hw1.calculator;

public class CalculatorUtils {


    public static double calculateAverage(int first, int second) {
        return Math.round((double) (first + second) / 2 * 100 / 100);
    }

    public static double calculateAverage(int first, int second, int third) {
        return Math.round((double) (first + second + third) / 3 * 100 / 100);
    }
}
