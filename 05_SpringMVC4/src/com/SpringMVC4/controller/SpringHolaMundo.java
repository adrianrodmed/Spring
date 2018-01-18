package com.SpringMVC4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringHolaMundo {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		String message = "Nuevo Mensaje";
		return new ModelAndView("welcome", "message", message);
	}
	@RequestMapping("/adios")
	public ModelAndView adios() {
		String message = "Nuevo Mensaje de adios";
		return new ModelAndView("adios", "message", message);
	}
}