/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whileapp.test;

import com.whileapp.hello.spring.mvc.web.controller.HomeController;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

/**
 *
 * @author eduardo
 */
public class TestApp {
    
    public TestApp() {
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testController() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mvc = standaloneSetup( controller ).build();
        mvc.perform( get("/") ).andExpect(view().name("home"));
    }
}
