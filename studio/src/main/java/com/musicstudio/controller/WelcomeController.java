package com.musicstudio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by linjay on 15/6/16.
 */
@Controller
public class WelcomeController {

    @RequestMapping("/page/welcome.html")
    public ModelAndView welcome() {
        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from com.musicstudio.controller.WelcomeController.java **********</div><br><br>";
        return new ModelAndView("welcome", "message", message);
    }
}
