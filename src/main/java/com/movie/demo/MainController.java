package com.movie.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    @RequestMapping("/")
    public String homePage(Model model)
    {
        model.addAttribute("Movie","<strong>This is a list of movies</strong>");
        return "index";
    }


    @GetMapping("/addmovie")
    public String loadFormPage(Model model)
    {
        model.addAttribute("aMovie",new Movie());
        return "movie";
    }

    @PostMapping("/addmovie")
    public String saveForm(@ModelAttribute("aMovie") Movie theMovie, Model model)
    {
        model.addAttribute("aMovie",theMovie);
return "confirmmovie";
   }

}