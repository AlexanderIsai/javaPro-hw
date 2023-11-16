package threads;

import java.util.Scanner;

public class MyThread {

    public static void main(String[] args) throws InterruptedException {

        Thread threadFirst = new Thread(() -> {
            int n = 0;
            while (true) {
                try {
                    Thread.sleep(10000);
                    n += 10;
                    System.out.println(n + " секунд прошло");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread threadSecond = new Thread(() -> {
            int n = 0;
            while (true) {
                try {
                    Thread.sleep(60000);
                    n++;
                    System.out.println(n + " минут прошло");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        threadFirst.start();
        threadSecond.start();
        Thread.sleep(22000);
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("====================================================" + i);

    }
}
