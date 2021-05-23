package com.project.base.systemManage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@ServletComponentScan
@ImportResource(locations = { "config/applicationContext.xml" }) 
@ComponentScan(basePackages = { "com.project.base.systemManage" })
@MapperScan("com.project.base.systemManage.dao.api")
@SpringBootApplication
public class StartApplication {
	
	

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
