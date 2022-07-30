package com.szl.letck.spring;

/**
 * @ClassName Person
 * @Description TODO
 * @Auther Administrator
 * @Date 2020/7/29 22:03
 * @Version v1.0
 */
public class Person {
    private Long Id;
    private String name;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
