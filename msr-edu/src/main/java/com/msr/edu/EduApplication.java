package com.msr.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 宋永楠
 * @version v1.0
 * @Package com.msr.edu
 * @date 2020/6/5 13:03
 * @Copyright @ msr
 */
@SpringBootApplication
@MapperScan("com.msr.edu.mapper")
public class EduApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class,args);
    }

}