package com.guia.CarlosMero.GuiaPractica;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Interfaz Guía Practica SpringBoot y PostgreSQL\n Carlos Mero M5A"
                
        )
)
public class GuiaPracticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuiaPracticaApplication.class, args);
	}

}
