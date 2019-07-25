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
@RequestMapping(value = "/user")
public class LoginController {
	@Autowired(required = true)
	@Qualifier(value = "userService")
	UserService userService;
	@Autowired
	SessionFactory sessionFactory;

	/*
	 * @RequestMapping(value="displayLogin",method=RequestMethod.GET) public
	 * ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse
	 * response) { ModelAndView modelAndView = new ModelAndView("login");
	 * modelAndView.addObject("login",new User()); return modelAndView; }
	 */
	@RequestMapping(value = "displayLogin", method = RequestMethod.GET)
	public String displayLogin(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}

	// test DAO
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String validateLogin(@ModelAttribute("user") User user, BindingResult result, Model model) {
		String page = null;
		if (result.hasErrors()) {
			return "error";
		}
		User verifiedUser = userService.getUserByLoginDetails(user.getEmailid(), user.getPassword());
		// System.out.println("The USer Id is " +verifiedUser.getUserid());
		// ModelAndView modelAndView = new ModelAndView("login");
		if (verifiedUser != null) {
			model.addAttribute("email", verifiedUser.getEmailid());
			page = "loginSuccess";
		} else {
			page = "login";
			model.addAttribute("message", "Invalid Credentials. Please try again.");
		}
		return page;
	}
}
