package in.himanshu.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageControler {
	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model) {
		
		model.addAttribute("msg","welcome");
		
		return "index";
	}
}
