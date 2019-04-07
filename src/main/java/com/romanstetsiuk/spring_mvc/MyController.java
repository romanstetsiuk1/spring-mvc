package com.romanstetsiuk.spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/zaloguj")
    String zaloguj() {
        return "formularz";
    }

    @PostMapping("/wynik")
    String wynikFormularza(@RequestParam("name") String name,
                           @RequestParam("secondName") String sn,
                           Model model) {
        model.addAttribute("secondName", sn);
        return "wynik";
    }

    @GetMapping("/dodaj")
    String dodaj(Model model) {
        model.addAttribute("user", new User());
        return "dodajUzytkownika";
    }

    @PostMapping("/zatwierdz")
    String submit(@ModelAttribute("user") User u, Model model) {
        Long id = u.getId();
        model.addAttribute("id", id);
        return "resultView";
    }

}
