package com.github.assembly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 程序入口
 *
 * @author mq
 */
@RestController
@SpringBootApplication
public class AssemblyApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssemblyApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

}
