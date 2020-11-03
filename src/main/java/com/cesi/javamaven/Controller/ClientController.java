package com.cesi.javamaven.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ClientController {

	@RequestMapping("/Client")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}