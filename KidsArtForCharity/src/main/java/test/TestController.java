package test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	public TestController() {
		System.out.println("inside controller constructor");
	}
	@RequestMapping(value="/hello",method= RequestMethod.GET)
	public String showHello(Model model) {
		model.addAttribute("message", "Hello World");
		return "index";
	}
}
