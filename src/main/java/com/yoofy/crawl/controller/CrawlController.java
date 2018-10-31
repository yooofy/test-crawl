package com.yoofy.crawl.controller;

import com.yoofy.crawl.service.CrawlService;
import com.yoofy.crawl.vo.BaseReturnVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yoofy.liu
 * @date 2018/10/31 14:08
 */
@RestController
@RequestMapping("/crawl")
public class CrawlController {
    @Autowired
    private CrawlService crawlService;

    @GetMapping("/testConnection")
    public BaseReturnVO testConnection(){
        return crawlService.testConnection();
    }
}
