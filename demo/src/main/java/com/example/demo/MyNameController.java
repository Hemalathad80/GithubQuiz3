package com.example.demo;

import com.example.demo.Greeting;
//import com.example.demo.Greeting;
import com.example.demo.MyName;

import java.util.concurrent.atomic.AtomicLong;

//import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNameController {

	private static final String template = "Hello, %s!";

	@GetMapping("/myname")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new MyName(name).toString();
	}
}

