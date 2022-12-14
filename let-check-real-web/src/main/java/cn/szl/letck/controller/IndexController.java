package cn.szl.letck.controller;

import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController("stock")
@Slf4j
public class IndexController extends SpringBootServletInitializer {

    @Autowired
    private Redisson redisson;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private static final String redis_key = "stock:sku";

    @RequestMapping("/deduct_stock")
    public String deductStock() {

        RLock rLock = redisson.getLock("RDL:SKU:1");
        if (rLock.tryLock()) {
            System.out.println("已获得锁");
        }

        String stock1 = stringRedisTemplate.opsForValue().get(redis_key);

        if (stock1 != null) {
            int stock = Integer.parseInt(stock1);
            if (stock > 0) {
                int realStock = stock - 1;
                stringRedisTemplate.opsForValue().set(redis_key, realStock + "");
                System.out.println("扣减库存，剩余库存 " + realStock);
            } else {
                System.out.println("扣减库存失败 ");
            }
        } else {
            stringRedisTemplate.opsForValue().set(redis_key, "100", 30, TimeUnit.SECONDS);
        }

        rLock.unlock();

        return "end";
    }
}
