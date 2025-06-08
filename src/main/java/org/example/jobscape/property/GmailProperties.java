package org.example.jobscape.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@ConfigurationProperties(prefix = "gmail")
public record GmailProperties(String appName, String credentialsPath, String tokenPath) {

}