package com.example.test.dao;

import java.util.List;

import com.example.test.vo.TestVo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    public List<TestVo> selectListMember();

}