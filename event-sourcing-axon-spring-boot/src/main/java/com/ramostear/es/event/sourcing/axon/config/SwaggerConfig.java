package com.ramostear.es.event.sourcing.axon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * @author: ramostear
 * @email: ramostear@163.com
 * @create-time: 2019/4/17 0017-16:39
 * @desc: [一句话说明该文件的功能]
 * @since: V 0.0.1
 * @company： www.taolicloud.com
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket apiDocket(){
        return new Docket ( DocumentationType.SWAGGER_2 )
                .select ()
                .apis ( RequestHandlerSelectors.basePackage ( "com.ramostear.es.event.sourcing.axon" ) )
                .paths ( PathSelectors.any () )
                .build ()
                .apiInfo ( getApiInfo() );
    }

    private ApiInfo getApiInfo(){
        return new ApiInfo (
                "Event Sourcing using Axon and Spring Boot",
                "Application to demonstrate Event Sourcing using Axon and Spring Boot",
                "1.0.0",
                "Ramostear of Service",
                new Contact ( "Ramostear","https://www.ramostear.com","ramostear@163.com" ),
                "",
                "");
    }
}
