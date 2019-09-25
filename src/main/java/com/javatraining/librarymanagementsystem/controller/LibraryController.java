package com.javatraining.librarymanagementsystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LibraryController {

	@RequestMapping(value = "/welcome/message", produces = "application/json", method = { RequestMethod.GET })
	public String showWelcomeMessage() {
		return "Welcome";

	}

	@RequestMapping(value = "/welcome/hello", produces = "application/json", method = { RequestMethod.GET })
	public String showHelloMessage() {
		return "Hello";

	}

}
