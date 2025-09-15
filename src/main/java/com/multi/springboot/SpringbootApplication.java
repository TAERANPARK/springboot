package com.multi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = "com.multi")

public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringbootApplication.class);
        app.setWebApplicationType(WebApplicationType.SERVLET); // 강제 서블릿
        app.run(args);
    }

}
