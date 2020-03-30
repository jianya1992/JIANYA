package com.example.demo.dao;

import com.example.demo.entity.model.TopOrderAfterApply;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface TopOrderAfterApplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TopOrderAfterApply record);

    int insertSelective(TopOrderAfterApply record);

    TopOrderAfterApply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TopOrderAfterApply record);

    int updateByPrimaryKey(TopOrderAfterApply record);
}