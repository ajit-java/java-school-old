package de.ajit.minify.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ajit on 20.10.15.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String hello()
    {
        return "index";
    }
}
