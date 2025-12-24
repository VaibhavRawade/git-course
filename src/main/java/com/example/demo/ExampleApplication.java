package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExampleApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(ExampleApplication.class, args);
        NewFile n=new NewFile();
        n.a=10;
        n.b=20;
        System.out.println(n.getData());
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot from Docker!";
    }
}
