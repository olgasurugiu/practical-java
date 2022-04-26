package com.course.practicaljava.api.server;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DefaultRestApi {

	@GetMapping(value = "/welcome")
	public String welcome() {
        List<String> list = Arrays.asList("Hello", " this is", " Spring boot", " REST API");
        String result = String.join(",", list);

        System.out.println(result);
		return "Welcome to Spring Boot";
	}
	
	@GetMapping(value = "/time")
	public String time() {
		return LocalTime.now().toString();
	}
}
