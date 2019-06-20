package br.com.nelsonwilliam.dsp20191.chernobyl.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "redirect:/filmes";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

}
