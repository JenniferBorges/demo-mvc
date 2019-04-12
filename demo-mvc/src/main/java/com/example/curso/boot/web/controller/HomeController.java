package com.example.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author jennifer
 */
@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "/home";
	}
}
