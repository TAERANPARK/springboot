package com.multi.aop;

import com.multi.aop.service.SampleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopApplication {
    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(SampleService svc) {
        return args -> {
            System.out.println("\n== greet ==");
            String g = svc.greet("taeran");
            System.out.println("[main] greet -> " + g);

            System.out.println("\n== calc ==");
            int c = svc.calc(2, 3);
            System.out.println("[main] calc -> " + c);

            System.out.println("\n== fail ==");
            try {
                svc.fail();
                System.out.println("[main] after fail()"); // 실행 안 됨(예외 던지면)
            } catch (Exception e) {
                System.out.println("[main] caught -> " + e.getClass().getSimpleName());
            }
        };
    }
}