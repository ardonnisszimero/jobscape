package org.example.jobscape;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@ConfigurationPropertiesScan(basePackages = "org.example")
public class JobScapeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobScapeApplication.class, args);
    }

}
