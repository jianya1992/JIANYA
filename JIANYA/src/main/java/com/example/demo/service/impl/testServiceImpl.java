package com.example.demo.service.impl;


import com.example.demo.dao.TopOrderAfterApplyMapper;
import com.example.demo.entity.model.TopOrderAfterApply;
import com.example.demo.service.testService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
public class testServiceImpl implements testService {

    @Autowired
    private TopOrderAfterApplyMapper applyMapper;

    @Override
    public TopOrderAfterApply selectById(Long id) {
        TopOrderAfterApply apply = applyMapper.selectByPrimaryKey(id);
        return apply;
    }
}
