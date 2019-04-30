package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName ShiroApplication
 * @Author yangfangyuan
 * @Date 2019/4/11 0:27
 * @Version 1.0
 * @Desscription //权限启动类
 */

@EnableTransactionManagement
//@MapperScan("com.springboot.mapper")
@SpringBootApplication
public class ShiroApplication {
  public static  Logger logger= LoggerFactory.getLogger(ShiroApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ShiroApplication.class, args);
        logger.info("ShiroApplication is success!");
    }
}
