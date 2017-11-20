package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/user")
	public String user(Model model){
		model.addAttribute("users",new String[]{"聂小倩","宁采臣","燕赤侠"});
		return "user";
	}
}
