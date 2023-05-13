package ar.com.java.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ar.com.java.test")
public class TestJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestJavaApplication.class);
    }
}
