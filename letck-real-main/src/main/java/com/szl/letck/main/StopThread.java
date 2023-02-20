package com.szl.letck.main;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName T
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/3 18:54
 * @Version v1.0
 */
public class StopThread {
    private static volatile boolean  stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread thread2;
        Thread thread1;
        thread1= new Thread(() -> {
            System.out.println("1");
        });
        thread2= new Thread(() -> {
            System.out.println("2");
        });
        thread2.join();
        thread2.start();
        thread1.start();
        thread1.join();
        System.out.println("3");
    }

//    public static void main(String[] args) {
//        ThreadLocalRandom random = ThreadLocalRandom.current();
//        int count = 0;
//        for (int i = 0; i < 5; i++) {
//            if (isInterested(random.nextInt(10))) {
//                count++;
//            }
//        }
//        System.out.printf("Found %d interested values%n", count);
//    }

    private static boolean isInterested(int i) {
        return i % 2 == 0;
    }
}