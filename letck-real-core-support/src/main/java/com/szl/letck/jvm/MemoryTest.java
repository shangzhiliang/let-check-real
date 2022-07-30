package com.szl.letck.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 内存溢出测试
 */
public class MemoryTest {

    byte[] arr = new byte[1024 * 100] ;// 25kb

    public static void main(String[] args) throws InterruptedException {
        List<MemoryTest> ts = new ArrayList<>();

        while(true){
            ts.add(new MemoryTest());

            Thread.sleep( 5);
        }
    }
}
