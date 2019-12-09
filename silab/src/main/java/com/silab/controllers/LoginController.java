package com.silab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/paginaInicial")
	public String login() {
		return "silab/paginaInicial/inicio";
	}
}
