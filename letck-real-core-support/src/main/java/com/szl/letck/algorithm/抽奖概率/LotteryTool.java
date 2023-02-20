package com.szl.letck.algorithm.抽奖概率;

import cn.hutool.core.util.RandomUtil;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * @ClassName LotteryTool
 * @Desc 抽奖工具类
 * 【抽奖算法理论】
 * 在一组奖品中，每个奖品有自己的概率，总概率为 1.0，也就是说在库存充足的情况下，必然能抽中其中的一个。
 * 通过「谢谢参与」来作为无奖的奖品（也是一种奖品）。
 * 需要注意的是：如果一组中所有的奖品，总概率之和不为 1.0，那么数值代表的概率就不是真实概率了，需要用所占比例来作为新的概率：新概率值=奖品概率/总概率。
 * 举个例子：只有 A 和 B 两个奖品，A 概率是 0.1，B 概率是 0.3，那么总概率就是 0.4，A 的真实概率就是0.1/0.4=0.25，B 的真实概率是0.3/0.4=0.75，真实的总概率依然为1。
 * 所以如果想要配置的奖品概率正好是抽奖时的概率值，那么就需要为这一组奖品列表的总概率配置成1.0；
 * 参考：https://www.cnblogs.com/lyloou/p/15724745.html#:~:text=%E6%8A%BD%E5%A5%96%E7%AE%97%E6%B3%95%E7%90%86%E8%AE%BA%20%E5%9C%A8%E4%B8%80%E7%BB%84%E5%A5%96%E5%93%81%E4%B8%AD%EF%BC%8C%E6%AF%8F%E4%B8%AA%E5%A5%96%E5%93%81%E6%9C%89%E8%87%AA%E5%B7%B1%E7%9A%84%E6%A6%82%E7%8E%87%EF%BC%8C%E6%80%BB%E6%A6%82%E7%8E%87%E4%B8%BA%201.0%EF%BC%8C%E4%B9%9F%E5%B0%B1%E6%98%AF%E8%AF%B4%E5%9C%A8%E5%BA%93%E5%AD%98%E5%85%85%E8%B6%B3%E7%9A%84%E6%83%85%E5%86%B5%E4%B8%8B%EF%BC%8C%E5%BF%85%E7%84%B6%E8%83%BD%E6%8A%BD%E4%B8%AD%E5%85%B6%E4%B8%AD%E7%9A%84%E4%B8%80%E4%B8%AA%E3%80%82,%E9%80%9A%E8%BF%87%E3%80%8C%E8%B0%A2%E8%B0%A2%E5%8F%82%E4%B8%8E%E3%80%8D%E6%9D%A5%E4%BD%9C%E4%B8%BA%E6%97%A0%E5%A5%96%E7%9A%84%E5%A5%96%E5%93%81%EF%BC%88%E4%B9%9F%E6%98%AF%E4%B8%80%E7%A7%8D%E5%A5%96%E5%93%81%EF%BC%89%E3%80%82%20%E9%9C%80%E8%A6%81%E6%B3%A8%E6%84%8F%E7%9A%84%E6%98%AF%EF%BC%9A%E5%A6%82%E6%9E%9C%E4%B8%80%E7%BB%84%E4%B8%AD%E6%89%80%E6%9C%89%E7%9A%84%E5%A5%96%E5%93%81%EF%BC%8C%E6%80%BB%E6%A6%82%E7%8E%87%E4%B9%8B%E5%92%8C%E4%B8%8D%E4%B8%BA%201.0%EF%BC%8C%E9%82%A3%E4%B9%88%E6%95%B0%E5%80%BC%E4%BB%A3%E8%A1%A8%E7%9A%84%E6%A6%82%E7%8E%87%E5%B0%B1%E4%B8%8D%E6%98%AF%E7%9C%9F%E5%AE%9E%E6%A6%82%E7%8E%87%E4%BA%86%EF%BC%8C%E9%9C%80%E8%A6%81%E7%94%A8%E6%89%80%E5%8D%A0%E6%AF%94%E4%BE%8B%E6%9D%A5%E4%BD%9C%E4%B8%BA%E6%96%B0%E7%9A%84%E6%A6%82%E7%8E%87%EF%BC%9A%E6%96%B0%E6%A6%82%E7%8E%87%E5%80%BC%3D%E5%A5%96%E5%93%81%E6%A6%82%E7%8E%87%2F%E6%80%BB%E6%A6%82%E7%8E%87%E3%80%82
 * @Author szl
 * @Version 1.0
 * @Date 2023/2/10 22:10
 */
public class LotteryTool {

    /**
     * 抽奖方法
     *
     * @param awardList 奖品列表，这些是备选的奖品（一定有库存的）
     * @param <T>       具体奖品类型
     * @return 返回一个抽中的奖品
     */
    public static <T extends BaseAward> T draw(List<T> awardList) {
        if (CollectionUtils.isEmpty(awardList)) {
            return null;
        }

        // 获取总概率，当奖品总概率正好为1时，奖品的 probability 就是真实的概率，否则会按新的比例作为概率
        double sumProbability = awardList.stream()
                .map(BaseAward::getProbability)
                .reduce(0.0, Double::sum);

        // 一共会尝试 awardList.size() 次，确保能返回一个奖品
        for (T t : awardList) {
            // 使用随机值，左闭右开（包含0，不包含1）
            if (t.getProbability() > RandomUtil.randomDouble(0.0, 1.0) * sumProbability) {
                return t;
            }
            sumProbability = sumProbability - t.getProbability();
        }

        // 其它情况，会到这里（理论上，一定到不了这里的。）
        return null;
    }
}
