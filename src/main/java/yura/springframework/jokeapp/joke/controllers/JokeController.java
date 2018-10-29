package yura.springframework.jokeapp.joke.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yura.springframework.jokeapp.joke.sevices.JokeService;

/**
 * Created by yulo0717 on 10/29/2018.
 */
@Controller
public class JokeController {

    private final JokeService jokeService;
    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})
    public String getJoke(Model model){

        model.addAttribute("joke",jokeService.getJoke());

        return "chucknorris";
    }
}
