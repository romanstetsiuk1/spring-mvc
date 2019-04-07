package com.romanstetsiuk.spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping("/sciezkaDoWidoku")
    String pokazWidok() {
        return "widok";
    }

    @GetMapping("/wiadomosc")
    String wiadomosc(Model model) {
        model.addAttribute("message", "cokolwiek");
        return "msgWidok";
    }

    @GetMapping("/wiadomosc/{tresc}")
    String wiadomosc(Model model, @PathVariable("tresc") String s, @RequestParam("imie") String i) {

        model.addAttribute("message", s);

        model.addAttribute("parametr", i);

        return "msgWidok";
    }

}
