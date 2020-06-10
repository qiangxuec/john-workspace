package com.john.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
*
*@Component注解，表明当需要创建类时，这个被注解的类是一个候选类。就像是举手
*@ComponentScan用于扫描指定包下的类。就像看都有哪些举手了。
*/

@Configuration
@ComponentScan("com.john.service.**.service")
@MapperScan({"com.john.**.dao"})//扫描**Dao.java文件
public class JohnAdminConfig {


}
