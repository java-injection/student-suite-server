package it.ji.server.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingPageController {

    @GetMapping("/home")
    public String getLandingPage(){
        return "index";
    }
}
