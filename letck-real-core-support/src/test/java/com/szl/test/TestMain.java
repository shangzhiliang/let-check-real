package com.szl.test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName TestMain
 * @Description:TODO
 * @Auther Administrator
 * @Date 2022/1/18 10:50
 * @Version 1.0
 */
public class TestMain {



    public static void main(String[] args) {
        thenApply();
    }

    public static void thenApply() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CompletableFuture cf = CompletableFuture.supplyAsync(() -> {
            try {
                //  Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("supplyAsync " + Thread.currentThread().getName());
            return "hello";
        }, executorService).thenApplyAsync(s -> {
            System.out.println(s + " world");
            return "hhh";
        }, executorService);
        cf.thenRunAsync(() -> {
            System.out.println("ddddd");
        });
        cf.thenRun(() -> {
            System.out.println("ddddsd");
        });
        cf.thenRun(() -> {
            System.out.println(Thread.currentThread());
            System.out.println("dddaewdd");
        });
    }
}
