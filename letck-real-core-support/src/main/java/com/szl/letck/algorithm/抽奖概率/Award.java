package com.szl.letck.algorithm.抽奖概率;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName Award
 * @Desc TODO
 * @Author szl
 * @Version 1.0
 * @Date 2023/2/10 22:06
 */
@Setter
@Getter
@ToString
public class Award extends BaseAward{
    private Integer id;
    private String name;
    private Double price;
    private Integer stock;

    public Award(Integer id, String name, Double price, Double probability, Integer stock) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        setProbability(probability);
    }

}
