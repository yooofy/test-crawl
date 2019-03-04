package com.yoofy.immortal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yoofy.liu
 * @date 2019/3/4 17:40
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public static String index(){
        return "index.html";
    }
}
