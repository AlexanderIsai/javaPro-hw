package threads;

import java.util.Scanner;

public class MainStream {
    private static double result = 0;
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number");
        int number = scanner.nextInt();
        Object lock = new Object();

        Thread odd = new Thread(() -> {
            synchronized (lock){
                calculateOddNums(number);
            }

        });
        Thread even = new Thread(() -> {
            synchronized (lock){
                calculateEvenNums(number);
            }
        });
        odd.start();
        even.start();
        Thread.sleep(1000);
        System.out.println(result);

    }

    public static void addDoubles(double number){
        result += number;
    }
    private static void calculateEvenNums(int terms) {
        for (int i = 0; i < terms; i++) {
            double num = 1.0 / factorial(2 * i);
            addDoubles(num);
        }
    }

    private static void calculateOddNums(int terms) {
        for (int i = 0; i < terms; i++) {
            double num = 1.0 / factorial(2 * i + 1);
            addDoubles(num);
        }
    }
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
