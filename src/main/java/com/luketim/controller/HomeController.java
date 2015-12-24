package com.luketim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public static String index() {
        return "index";
    }

    @RequestMapping(value = "/test")
    public static String test() {
        return "test";
    }
}
