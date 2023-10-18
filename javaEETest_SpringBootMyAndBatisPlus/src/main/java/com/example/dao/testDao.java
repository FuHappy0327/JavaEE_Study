package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.test;
import org.apache.ibatis.annotations.Mapper;
//TODO 定义dao类型继承BaseMapper将对应的是实体类传入泛型中
@Mapper
public interface testDao extends BaseMapper<test> {

}
