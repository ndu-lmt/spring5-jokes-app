package za.co.wg.spring5jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import za.co.wg.spring5jokesapp.services.JokeService;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping
    public String getJoke(Model model) {
        model.addAttribute("joke", this.jokeService.getJoke());
        return "index";
    }
}
