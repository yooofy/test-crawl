package com.yoofy.crawl;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author yoofy.liu
 */
@SpringBootApplication
@MapperScan({"com.yoofy.crawl.dao", "com.yoofy.crawl.daoEX"})
public class CrawlApplication {
    private static Logger logger = LoggerFactory.getLogger(CrawlApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CrawlApplication.class, args);
        logger.info("service start");
    }
}
