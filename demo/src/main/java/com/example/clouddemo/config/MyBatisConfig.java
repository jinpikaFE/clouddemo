package com.example.clouddemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan("com.example.clouddemo.mbg.mapper")
public class MyBatisConfig {
}
