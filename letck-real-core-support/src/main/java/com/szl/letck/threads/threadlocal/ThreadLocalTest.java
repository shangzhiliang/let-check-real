package com.szl.letck.threads.threadlocal;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.alibaba.ttl.threadpool.TtlExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 */
public class ThreadLocalTest {

    public static void main(String[] args) {

//        testThreadLocal();

//        testInheritableThreadLocal();

        testMutiThreadsDataTransfer();
    }

    private static void testThreadLocal(){
        ThreadLocal<Integer> local = new ThreadLocal<>();
        local.set(6);
        System.out.println("父线程设置值为： " +local.get() );
    }

    private static void testInheritableThreadLocal(){
        InheritableThreadLocal<Integer> inheritableThreadLocal = new InheritableThreadLocal();

        inheritableThreadLocal.set(6);

        System.out.println("父线程设置值为： inheritableThreadLocal.get:" + inheritableThreadLocal.get());

        new Thread(()->{
            System.out.println("子线程获取数据： inheritableThreadLocal.get:" + inheritableThreadLocal.get());
        }).start();
    }


    /**
     * 测试多线程之前数据共享
     *  InheritableThreadLocal 对象只能在init方法里将父类中的 变量传递过去，不能在线程运行过程中修改。
     *  因此引入阿里巴巴一套开源组件，实现多线程间数据实时共享。
     */
    private static void testMutiThreadsDataTransfer(){
        TransmittableThreadLocal<Integer> transmittableThreadLocal = new TransmittableThreadLocal<>();
        transmittableThreadLocal.set(5);

        System.out.println("父线程设置值 ： " + transmittableThreadLocal.get());

        ExecutorService executorService = TtlExecutors.getTtlExecutorService(Executors.newFixedThreadPool(1));

        transmittableThreadLocal.set(6);

        executorService.submit(()->{
            System.out.println("第一次子线程获取 父线程共享值：" + transmittableThreadLocal.get());
        });

        transmittableThreadLocal.set(7);

        executorService.submit(() -> {
            System.out.println("第二次子线程获取 父线程共享值：" + transmittableThreadLocal.get());
        });
    }

}
