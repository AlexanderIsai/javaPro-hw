package threads;

public class MyDeadLock {
    public static int value = 0;
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Object lock2 = new Object();

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                synchronized (lock) {
                    synchronized (lock2) {
                        value++;
                    }
                }
            }
        });
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                synchronized (lock2) {
                    synchronized (lock) {
                        value++;
                    }
                }
            }
        });
        thread.start();
        thread1.start();

        Thread.sleep(100);

        System.out.println(value);
    }
}
