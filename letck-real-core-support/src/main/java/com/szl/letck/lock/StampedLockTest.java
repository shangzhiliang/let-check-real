package com.szl.letck.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

/**
 * @ClassName StampedLockTest
 * @Description:TODO
 * @Auther Administrator
 * @Date 2022/2/7 11:17
 * @Version 1.0
 */
public class StampedLockTest {


    public static void main(String[] args) {
        //创建锁
        StampedLock lock = new StampedLock();

        Balance balance = new Balance(10000L);

        Runnable w = () -> {
            long stamp = lock.writeLock();
            balance.setAmount(balance.getAmount() + 1000);
            System.out.println("Write: " + balance.getAmount());
            lock.unlockWrite(stamp);
        };

        Runnable r = () -> {
            long stamp = lock.tryOptimisticRead();
            if(!lock.validate(stamp)){
                stamp = lock.readLock();
                try {
                    System.out.println("Read : " + balance.getAmount());
                }finally {
                    lock.unlockRead(stamp);
                }
            } else {
                System.out.println("Optimistic read fail .");
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 50; i++) {
            executor.submit(w);
            executor.submit(r);
        }

    }
}

class Balance{
    private long amount;

    public Balance(long amount){
        this.amount = amount;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
