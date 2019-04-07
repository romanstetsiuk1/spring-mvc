package com.romanstetsiuk.spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/sciezkaDoWidoku")
    String pokazWidok() {
        return "widok";
    }

}
