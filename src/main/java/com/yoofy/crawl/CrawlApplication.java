package com.yoofy.crawl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author yoofy.liu
 */
@SpringBootApplication
@MapperScan({"com.yoofy.crawl.dao", "com.yoofy.crawl.daoEX"})
public class CrawlApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrawlApplication.class, args);
    }
}
