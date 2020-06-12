package com.msr.statistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 宋永楠
 * @version v1.0
 * @Package com.msr.statistics
 * @date 2020/6/12 11:07
 * @Copyright @ msr
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.msr.statistics","com.msr.common"})
public class StatisticsApplication {
    public static void main(String[] args) {
        SpringApplication.run(StatisticsApplication.class, args);
    }
}
