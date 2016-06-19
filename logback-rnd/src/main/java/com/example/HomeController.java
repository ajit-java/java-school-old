package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ajit on 29.10.15.
 */
@RestController
public class HomeController {
    @RequestMapping(value="/")
    public String hello() throws Exception
    {
        if(true)
            throw new Exception("my test exception ajit");

        Thread.sleep(3000);

        return "hello from 1234";
    }
}
