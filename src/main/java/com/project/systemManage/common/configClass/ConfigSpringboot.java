package com.project.systemManage.common.configClass;
import java.util.List;

import javax.servlet.Servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorViewResolver;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.project.systemManage.common.exceptionHandler.CustomExceptionController;

/**
 * ClassName: ConfigSpringboot
 */
@Configuration
@ConditionalOnWebApplication
@ConditionalOnClass({Servlet.class, DispatcherServlet.class})
@AutoConfigureBefore(WebMvcAutoConfiguration.class)
@EnableConfigurationProperties(ResourceProperties.class)
public class ConfigSpringboot {
	
    @Autowired(required = false)
    private List<ErrorViewResolver> errorViewResolvers;
    
    private final ServerProperties serverProperties;

    public ConfigSpringboot(ServerProperties serverProperties) {
        this.serverProperties = serverProperties;
    }

    // 使用FastJson作为系统的转换
 	@Bean 
 	public HttpMessageConverters fastMessageConverters(){
 	 return new HttpMessageConverters(new FastJsonHttpMessageConverter()); 
 	}
 	
    /**
     * 自定义异常处理类的Bean配置
     * @param errorAttributes
     * @return
     */
    @Bean
    public CustomExceptionController basicErrorController(ErrorAttributes errorAttributes) {
        return new CustomExceptionController(errorAttributes, this.serverProperties.getError(),
                this.errorViewResolvers);
    }


}
