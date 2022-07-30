package cn.szl.letck.controller;

import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class IndexController extends SpringBootServletInitializer {

//    @Autowired
//    private Redisson redisson;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/deduct_stock")
    public String deductStock(){

//        int stock = Integer.parseInt(stringRedisTemplate.opsForValue().get("stock"));

//        if (stock > 0){
//            int realStock = stock -1 ;
//            stringRedisTemplate.opsForValue().set("stock",realStock +"");
//            System.out.println("扣减库存，剩余库存 " + realStock);
//        } else {
            System.out.println("扣减库存失败 " );
//        }

        return "end";
    }
}
