
package com.speedbae.clocked;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan(basePackages = "com.sb.services")
@EnableJpaRepositories(basePackages = "com.sb.services")
@EntityScan(basePackages = "com.sb.services")
@SpringBootApplication
public class ClockedApp {

	public static void main(String[] args) {
		SpringApplication.run(ClockedApp.class, args);
	}

}
