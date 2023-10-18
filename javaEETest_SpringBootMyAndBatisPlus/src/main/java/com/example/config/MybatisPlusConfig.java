package com.example.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {
    @Bean//MP的拦截器Bean
    public MybatisPlusInterceptor getMPInterceptor(){
        //1、定义MP拦截器
        MybatisPlusInterceptor mpI=new MybatisPlusInterceptor();
        //2、添加具体拦截器
        mpI.addInnerInterceptor(new PaginationInnerInterceptor());
        return mpI;
    }
}
