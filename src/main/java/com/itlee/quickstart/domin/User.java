package com.itlee.quickstart.domin;


import lombok.Data;

@Data // lombok 注解代替写 getter 和 setter 方法。自动生成无参的构造方法。
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String email;
}
