package io.pivotal.fedex.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class StaticController {
	
	@RequestMapping(value = "", method=RequestMethod.GET)
	public String index(Model model) {
		return "index";
	}

	@RequestMapping(value="/workshop", method=RequestMethod.GET)
	public String workshop(Model model) {
		return "workshop";
	}	

}
