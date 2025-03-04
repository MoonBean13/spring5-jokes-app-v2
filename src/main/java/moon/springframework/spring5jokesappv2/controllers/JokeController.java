package moon.springframework.spring5jokesappv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import moon.springframework.spring5jokesappv2.services.JokeService;

@Controller
public class JokeController {

	private final JokeService jokeService;
	
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	/** 
	 * By returning "index" String,
	 * this tells Thymleaf to look for a template file called index.html.
	 * @param model
	 * @return "index" String
	 */
	@RequestMapping({"/", ""})
	public String showJoke(Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		return "index";
	}
	
}
