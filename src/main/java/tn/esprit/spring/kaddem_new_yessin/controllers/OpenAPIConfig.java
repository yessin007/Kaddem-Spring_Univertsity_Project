package tn.esprit.spring.kaddem_new_yessin.controllers;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI().info(infoAPI());
    }

    public Info infoAPI() {
        return new Info().title("SpringDoc-Demo").description("TP Kaddem étude de cas").contact(contactAPI());
    }

    public Contact contactAPI() {
        Contact contact = new Contact().name("Yessin Khlif").email("yessin.khlif@esprit.tn").url("https://www.linkedin.com/in/ghassen-hammouda-97859996/");
        return contact;
    }



}

