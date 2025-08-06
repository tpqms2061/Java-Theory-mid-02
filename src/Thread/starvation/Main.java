package Thread.starvation;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread high = new Thread(() -> {
                while(true) {
                    if (lock.tryLock()) {
                        try {
                            System.out.println(Thread.currentThread().getName() + "실행");

                            try { Thread.sleep(50); } catch (InterruptedException e) {}
                        } finally {
                            lock.unlock();
                        }
                    }
                    try { Thread.sleep(10); } catch (InterruptedException e) {}
                }
            }, "High-" + i);
            high.setPriority(Thread.MAX_PRIORITY);
            high.start();

            Thread low = new Thread(() -> {
                while(true) {
                    if (lock.tryLock()) {
                        try {
                            System.out.println(Thread.currentThread().getName() + "실행");

                            try { Thread.sleep(100); } catch (InterruptedException e) {}
                        } finally {
                            lock.unlock();
                        }
                    } else {
                        System.out.println(Thread.currentThread().getName() + "대기");
                    }
                    try { Thread.sleep(30); } catch (InterruptedException e) {}
                }
            }, "Low-" + i);
            low.setPriority(Thread.MIN_PRIORITY);
            low.start();
        }
    }
}