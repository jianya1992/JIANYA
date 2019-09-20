package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Contact;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket buildDocket(){
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(buildApiInf())    //.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))//要注释的接口名
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo buildApiInf(){
		return new ApiInfoBuilder()
				.title("王者荣耀开黑")
				.description("禁 猴子、王昭君")
				.termsOfServiceUrl("http://www.cnblogs.com/ttzzyy/网址链接")
				.contact(new Contact("JIANYA", "https://pvp.qq.com/", "344541946@qq.com"))
				.version("1.0")
				.build();

	}
}