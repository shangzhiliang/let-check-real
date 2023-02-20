package com.szl.letck.algorithm.抽奖概率;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName BaseAward
 * @Desc  奖品基类
 * @Author szl
 * @Version 1.0
 * @Date 2023/2/10 22:05
 */
@Setter
@Getter
public class BaseAward {

    /**
     * 抽中这个奖品的概率
     */
    private Double probability;
}
