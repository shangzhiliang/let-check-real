package com.szl.letck.algorithm.抽奖概率;

import cn.hutool.core.util.StrUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AwardTest
 * @Desc 抽奖算法测试
 * @Author szl
 * @Version 1.0
 * @Date 2023/2/10 22:21
 */
public class AwardTest {

    public static void main(String[] args) {
        // 奖品列表，库存一共36：手机（1）+ 5元（5）+15元（10）+谢谢参与（20）
        final List<Award> awardList = new ArrayList<>(4);
        awardList.add(new Award(1, "苹果手机", 7000.0, 0.05, 1));
        awardList.add(new Award(2, "5元金币", 5.0, 0.1, 5));
        awardList.add(new Award(3, "15元天堂雨伞", 15.0, 0.25, 10));
        awardList.add(new Award(4, "谢谢参与", 0.0, 0.6, 20));

        System.out.println("开始抽奖:");

        // 抽奖50次
        for (int i = 0; i < 50; i++) {
            String msg;
            final Award draw = LotteryTool.draw(awardList);
            if (draw == null) {
                msg = "奖品抽完了，下次早点来吧~";
            } else {
                msg = StrUtil.format("抽到了价值「{}」的奖品「{}」", draw.getPrice(), draw.getName());

                // 抽到奖品了，需要减库存，库存不足了，要从列表中剔除
                draw.setStock(draw.getStock() - 1);
                if (draw.getStock() <= 0) {
                    awardList.remove(draw);
                }
            }

            System.out.println(StrUtil.format("第{}次抽奖，结果为：{}", i+1, msg));
        }

        System.out.println("抽奖结束.");
    }
}
