package com.cavendish.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cavendish.model.Greeting;

@RestController
public class IndexController implements ErrorController {

	private static final String PATH = "/error";

	@GetMapping(value = PATH)
	public String error() {
		return "Error handling";
	}

	public String getErrorPath() {
		return PATH;
	}

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}