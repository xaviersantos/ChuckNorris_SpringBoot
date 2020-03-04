package com.ua.es.labproject.controller;

import com.ua.es.labproject.service.JokeService;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jokes")
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    //@GetMapping("/list")
    //public Iterable<Joke> list() {return jokeService.list();}

    @GetMapping("/list")
    @EventListener
    public String view(Model model) {
        model.addAttribute("jokes", jokeService.list());
        return "jokes";
    }

}
