package com.yoofy.immortal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yoofy.liu
 * @date 2018/10/31 14:08
 */
@Controller
@RequestMapping("/practice")
public class PracticeController {
    @ResponseBody
    @RequestMapping("/practiceMagic")
    public String practiceMagic() {
        return null;
    }
}
