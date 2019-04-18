package com.ramostear.cqrs.axon.config;

import com.ramostear.cqrs.axon.interceptors.ServletContextInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/18 0018-20:20
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {


    @Autowired
    ServletContextInterceptor servletContextInterceptor;


    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor ( servletContextInterceptor ).addPathPatterns ( "/**" );
        super.addInterceptors ( registry );
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/")
                .addResourceLocations("classpath:/public/")
                .addResourceLocations("classpath:/templates/")
                .addResourceLocations("classpath:/resources/");
        super.addResourceHandlers ( registry );
    }
}
