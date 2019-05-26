package io.kubrix.backend.services.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndpoint {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
}
