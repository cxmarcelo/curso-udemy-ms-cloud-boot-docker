package br.com.marcelo.greetingservice.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcelo.greetingservice.model.Greeting;

@RestController
public class GreetingController {

	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
		return new Greeting(counter.incrementAndGet(), name);
	}
}
