package com.marketplace.controller.user;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marketplace.model.user.User;
import com.marketplace.service.user.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	 @Autowired(required=true)
	 @Qualifier(value="userService")
		UserService userService;
	 @Autowired
	 SessionFactory sessionFactory;
	
		@RequestMapping(value = "displayRegister", method = RequestMethod.GET)
		public String displayLogin(Model model) {
			model.addAttribute("user", new User());
			return "register";
		}
		
		@RequestMapping(value="register", method = RequestMethod.POST)
		public String registerUser(@ModelAttribute(value="user") User user, BindingResult result, Model model) {
			if(result.hasErrors()) {
				return "error";
			}
			userService.save(user);
			model.addAttribute("message", "Registration Successful! Welcome!");
			model.addAttribute("email",user.getEmailid());
			return "loginSuccess";
		}
}
