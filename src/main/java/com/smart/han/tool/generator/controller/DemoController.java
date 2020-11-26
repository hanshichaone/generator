package com.smart.han.tool.generator.controller;


import com.smart.han.tool.generator.util.IdGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class DemoController {

    @Resource
    private IdGenerator idGenerator;

    @RequestMapping("/get/id")
    @ResponseBody
    public String generate(){
        return idGenerator.nextId();
    }
}
