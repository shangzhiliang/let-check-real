package com.szl.letck.spring;

/**
 * @ClassName Food
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/29 22:04
 * @Version v1.0
 */
public class Food {
    private Long id;

    private String foodName;

    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
