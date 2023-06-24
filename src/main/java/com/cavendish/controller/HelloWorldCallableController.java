package com.cavendish.controller;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

@RestController
public class HelloWorldCallableController {
	@GetMapping(value = "/testCallable")
	public Callable<String> echoHelloWorld() {
		return () -> {
			Thread.sleep(ThreadLocalRandom.current().nextInt(5000));
			return "Hello World !!";
		};
	}

	@RequestMapping(value = "/resource-uri", method = RequestMethod.GET)
	public ResponseBodyEmitter handle() {
		ResponseBodyEmitter emitter = new ResponseBodyEmitter();
		// Pass the emitter to another component...
		return emitter;

		// in another thread
//	     emitter.send(foo1);

		// and again
//	     emitter.send(foo2);

		// and done
//	     emitter.complete();
	}
}