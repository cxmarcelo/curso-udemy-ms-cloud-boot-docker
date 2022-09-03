package br.com.marcelo.greetingservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("greeting-service")
public class GreetingConfig {
	
	private String greeting;
	private String defaultValue;
	
	public GreetingConfig() {
	}
	
	public GreetingConfig(String greeting, String defaultValue) {
		super();
		this.greeting = greeting;
		this.defaultValue = defaultValue;
	}

	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

}
