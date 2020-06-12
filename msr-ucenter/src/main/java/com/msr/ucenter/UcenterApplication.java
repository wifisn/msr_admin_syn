package com.msr.ucenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 宋永楠
 * @version v1.0
 * @Package com.msr.ucenter
 * @date 2020/6/12 10:46
 * @Copyright @ msr
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.msr.ucenter","com.msr.common"})
public class UcenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(UcenterApplication.class, args);
    }
}
