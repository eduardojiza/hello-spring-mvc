/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whileapp.hello.spring.mvc.web.controller;

import static javax.swing.text.html.FormSubmitEvent.MethodType.GET;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author eduardo
 */
@Controller
public class HomeController {
    @RequestMapping( value = "/" )
    public String home() {
        return "home";
    }
}
