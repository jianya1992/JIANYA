package com.example.demo.controller;

import com.example.demo.model.Person;
import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

@Api(description = "用户接口")
@RestController
@RequestMapping("/demoController")
public class test {

    @ApiOperation(value = "根据id查询学生信息", notes = "查询数据库中某个的学生信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public int getStudent(@PathVariable int id) {
        return 1;
    }

    public static void main(String[] args) {
        List<Person> list = Lists.newArrayList();
        list.add(new Person("jack", 26));
        list.add(new Person("jam", 25));
        list.add(new Person("tom", 30));
        List list1 = list.stream().filter(person -> person.getAge() == 20).collect(toList());
        List list2 = list.stream().limit(2).skip(1).collect(toList());
        List list3 = list.stream().distinct().collect(toList());
        List list4 = list.stream().sorted(Comparator.comparingInt(Person::getAge)).map(Person::getAge).collect(toList());
        List list5 = list.stream().map(Person::getName).collect(toList());
        String l = list.stream().map(Person::getName).collect(joining(","));
        list.stream().filter(person -> person.getAge() == 25).forEach(System.out::println);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
        System.out.println(list5);
        System.out.println(l);
    }
}
