package com.szl.letck.distribute;

/**
 * @ClassName TransactionalMessageApplication
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/8 17:04
 * @Version v1.0
 */
public class TransactionalMessageApplication {

    private static MockBusinessRunner mockBusinessRunner;

    public static void main(String[] args) throws Exception {
        mockBusinessRunner.run(args);
    }
}
