package com.gary.spring.cloud.function.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringCloudFunctionLambdaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFunctionLambdaApplication.class, args);
    }

    @Bean
    public Function<String, String> reverse() {
        return value -> new StringBuilder(value).reverse().toString();
    }

    @Bean
    public Supplier<Book> getBook() {
        return () -> new Book(101, "Spring Cloud Function");
    }

    @Bean
    public Consumer<String> printMessage() {
        return (input) ->System.out.println(input);
    }
}
