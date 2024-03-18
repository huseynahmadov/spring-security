package com.example.securitytutorial;

import com.example.securitytutorial.service.JwtService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SecurityTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityTutorialApplication.class, args);
    }

}
