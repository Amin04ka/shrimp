package laba12;
import java.time.LocalTime;
public class ex1 {

    public static void example1() throws InterruptedException {
        System.out.println("=== Пример 1: два потока с именем и временем ===");

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Пример 1 завершён.");
    }

    public static void example2() throws InterruptedException {
        System.out.println("=== Пример 2: числа от 1 до 10 с задержкой ===");

        Thread t = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t.start();
        t.join();
        System.out.println("Пример 2 завершён.");
    }

    public static void example3() {
        System.out.println("=== Пример 3: чёт / нечёт с синхронизацией ===");

        final Object lock = new Object();
        final int[] number = {1};

        Thread evenThread = new Thread(() -> {
            synchronized (lock) {
                while (number[0] < 10) {
                    if (number[0] % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number[0]);
                        number[0]++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        }, "Even Thread");

        Thread oddThread = new Thread(() -> {
            synchronized (lock) {
                while (number[0] < 10) {
                    if (number[0] % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number[0]);
                        number[0]++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        }, "Odd Thread");

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Пример 3 завершён.");
    }

    public static void independentTask() throws InterruptedException {
        System.out.println("=== Вариант №2: числа от 1 до 10 ===");

        Thread t = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t.start();
        t.join();
        System.out.println("Задание №2 завершено.");
    }

    public static void main(String[] args) throws InterruptedException {
        example1();
        example2();
        example3();
        independentTask();
    }
}
