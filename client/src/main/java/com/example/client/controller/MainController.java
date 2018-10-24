package com.example.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author xuan
 * @create 2018-10-20 21:51
 **/
@RestController
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String main() {
        return "Welcome to the index!";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "Welcome to the index!";
    }


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Principal principal(Principal user) {
        return user;
    }


}
