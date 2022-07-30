package com.szl.letck.distribute;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @ClassName MockBusinessRunner
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/8 15:47
 * @Version v1.0
 */
@RequiredArgsConstructor
@Component
public class MockBusinessRunner implements CommandLineRunner {

    private final MockBusinessService mockBusinessService;

    @Override
    public void run(String... args) throws Exception {
        mockBusinessService.saveOrder();
    }
}
