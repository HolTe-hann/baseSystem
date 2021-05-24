package com.project.systemManage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ServletComponentScan
@ImportResource(locations = { "config/applicationContext.xml" }) 
@ComponentScan(basePackages = { "com.project.systemManage" })
@MapperScan("com.project.systemManage.dao.api")
@SpringBootApplication
public class StartApplication {

	
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
