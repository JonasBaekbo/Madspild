package com.example.madspild;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("title", "Forside - Madspild");
        return "index";
    }
        @GetMapping("/privat")
        public String privat(Model model){
            model.addAttribute("title", "Til privatpersoner - Madspild");
            return "privat";
        }
        @GetMapping("/virksomheder")
        public String virksomheder(Model model){
            model.addAttribute("title", "Til virksomheder - Madspild");
            return "virksomheder";
        }
}
