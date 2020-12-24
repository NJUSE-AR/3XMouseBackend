package com.nju.ar.controllers;

import com.nju.ar.entities.TestEntity;
import com.nju.ar.services.TestService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: XYF
 * @Date: 2020/12/24
 * @Time: 16:36
 * @Package: com.nju.ar.controllers
 */

@RestController
@RequestMapping("/v1/test")
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/{test}")
    @ResponseBody
    public String addTest(@PathVariable(value = "test") String test) {

        testService.insertTest(test);

        return "insert " + test;
    }

    @GetMapping
    @ResponseBody
    public String getTests(@RequestParam(value = "top", required = false, defaultValue = "2") int top) {

        List<TestEntity> l = testService.listTests();

        if(top < l.size()){
            l = l.subList(0,top);
        }
        StringBuilder s;
        s = new StringBuilder(" ");
        for (TestEntity i : l) {
            s.append(i.toString());
        }

        return s.toString();
    }
}
