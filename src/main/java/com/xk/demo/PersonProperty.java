package com.xk.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author pingchun@meili-inc.com
 * @since 2020/1/5
 */
@ConfigurationProperties("person")
public class PersonProperty {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
