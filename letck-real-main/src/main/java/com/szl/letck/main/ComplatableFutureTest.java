package com.szl.letck.main;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ComplatableFutureTest
 * @Description:TODO
 * @Auther Administrator
 * @Date 2022/4/11 17:27
 * @Version 1.0
 */
public class ComplatableFutureTest {
    public static void thenApply() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CompletableFuture cf = CompletableFuture.supplyAsync(() -> {
            try {
                  Thread.sleep(2000);
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

    public static void main(String[] args) {
        // 除了Float，Double 之外其它包装类型数字有缓存，没缓存的不能用== 判断对象值一致。有缓存的可以,
        // 整形 区间[-128 ~ 127] 之间的数据有缓存，此区间之外的无缓存都是创建的新对象，不能用== 判断，因此最好所有整形封装类型用equals 判断
        Integer i1 = 1272;
        Integer i2 = 1272;
        System.out.println(i1.equals(i2));

        Float f1 = 22.3f;
        Float f2 = 22.3f;
        System.out.println(f1.floatValue() == f2.floatValue());

        Double d1 = 22.3d;
        Double d2 = 22.3d;
        System.out.println(d1== d2);
    }
}
