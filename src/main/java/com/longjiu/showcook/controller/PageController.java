package com.longjiu.showcook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @GetMapping("/{page}")
    public  String page(@PathVariable( name= "page") String  page){

        return page;

    }

}
