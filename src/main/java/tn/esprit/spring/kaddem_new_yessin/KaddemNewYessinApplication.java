package tn.esprit.spring.kaddem_new_yessin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Configuration
@EnableScheduling
@EnableAspectJAutoProxy
@ComponentScan("tn.esprit.spring")
public class KaddemNewYessinApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaddemNewYessinApplication.class, args);
    }

}
