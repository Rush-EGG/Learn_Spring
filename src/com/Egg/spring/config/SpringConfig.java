package com.Egg.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 添加Configuration类,将该类作为配置类,替代xml文件
@Configuration
// 确定扫描范围
@ComponentScan(basePackages = {"com.Egg"})
public class SpringConfig {
}
