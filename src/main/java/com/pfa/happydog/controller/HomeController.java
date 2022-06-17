package com.pfa.happydog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** this is a CONTROLLER: it's responsible for intercepting and dispatching http request
 * he return a view file name as a String
 */
@Controller
public class HomeController {
    @RequestMapping("home")
    public String Home(){
        System.out.println("Hello");
        return "home";
        // I removed .html and I put it in the properties file for better maintanability
    }
}
