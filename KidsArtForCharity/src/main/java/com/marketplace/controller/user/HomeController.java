package com.marketplace.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String displayHomePage(HttpServletRequest request, HttpServletResponse response) {
		return "home";
	}
}
