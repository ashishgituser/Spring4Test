package org.springtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springtest.logic.HomeLogic;
 
@Controller
@Component 
public class HomeController {

	@Autowired private HomeLogic homeLogic;
	
	@RequestMapping("/hello")
	public ModelAndView test() {
		String message = this.homeLogic.getMessage();
		return new ModelAndView("hello", "message", message);
	}

	public HomeLogic getHomeLogic() {
		return homeLogic;
	}

	public void setHomeLogic(HomeLogic homeLogic) {
		this.homeLogic = homeLogic;
	}
	
	
}
