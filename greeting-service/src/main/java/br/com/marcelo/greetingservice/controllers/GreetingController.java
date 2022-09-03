package br.com.marcelo.greetingservice.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcelo.greetingservice.config.GreetingConfig;
import br.com.marcelo.greetingservice.model.Greeting;

@RestController
public class GreetingController {

	private final AtomicLong counter = new AtomicLong();
	
	private static final String TEMPLATE = "%s, %s!";
	
	@Autowired
	private GreetingConfig config;
	
	@RequestMapping("greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
		
		if(name.isEmpty()) {
			name = config.getDefaultValue();
		}
		
		return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, config.getGreeting(), name));
	}
}
