package com.example.domain;

import lombok.*;

//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode 以上四个合并为@Data
//@NoArgsConstructor
//@AllArgsConstructor TODO lombok提供的注解用来自动配置对应的方法
@Data
public class test {
    int id;
    String name,age;

}
