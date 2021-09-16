package com.jecara.housingAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HousingApiApplication {

	private static final Logger logger = LoggerFactory.getLogger(HousingApiApplication.class);

	public static void main(String[] args) {
		logger.info("Solicitud de inicio de aplicación");
		SpringApplication.run(HousingApiApplication.class, args);
	}

}

// TODO -> Configurar conexión mongo en application.properties [https://ichi.pro/es/conectando-mongodb-en-la-aplicacion-spring-boot-257011337931448]
// TODO -> Pillar servidor o poner raspberry para ir haciendo pruebas
