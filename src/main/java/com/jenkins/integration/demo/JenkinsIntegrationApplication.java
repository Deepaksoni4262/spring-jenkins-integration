package com.jenkins.integration.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Log4j2
public class JenkinsIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsIntegrationApplication.class, args);
		System.out.println("Starting JenkinsIntegrationApplication application");

	}

}
