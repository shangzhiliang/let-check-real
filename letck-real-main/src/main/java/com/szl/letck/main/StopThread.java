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
//    public static void main(String[] args) throws InterruptedException {
//        Thread backgroundThread = new Thread(() -> {
//            int i = 0;
//            while (!stopRequested){
//                i++;
//                System.out.println("T1--i++ = " + i);
//                try {
//                    TimeUnit.SECONDS.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        });
//
//
//        Thread t2 = new Thread(() -> {
//            while (!stopRequested) {
//                System.out.println("T2--i++ = " + stopRequested);
//                try {
//                    TimeUnit.SECONDS.sleep(1);
//                } catch (InterruptedException e) {
//
//                }
//            }
//        });
//
//
//        backgroundThread.start();
//        t2.start();
//        TimeUnit.SECONDS.sleep(1);
//        stopRequested = true;
//    }

    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (isInterested(random.nextInt(10))) {
                count++;
            }
        }
        System.out.printf("Found %d interested values%n", count);
    }

    private static boolean isInterested(int i) {
        return i % 2 == 0;
    }
}