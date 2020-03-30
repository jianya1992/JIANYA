package com.example.demo.controller;

import com.example.demo.entity.model.TopOrderAfterApply;
import com.example.demo.service.impl.testServiceImpl;
import com.example.demo.service.testService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "用户接口")
@RestController
@RequestMapping("/demoController")
public class TestController {

    @Autowired
    private testService service;

    @ApiOperation(value = "根据id查询学生信息", notes = "查询数据库中某个的学生信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TopOrderAfterApply getStudent(@PathVariable Long id) {
        return service.selectById(id);
    }

}
