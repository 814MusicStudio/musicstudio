package com.musicstudio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by linjay on 15/6/16.
 */
@Controller
public class TunerController {


    @RequestMapping("/page/tuner.html")
    public ModelAndView tuner() {
        String tunerBanner = "<br><div style='text-align:center;'>"
                + "<h3>Hi, guitar player!</h3></div><br><br>";
        return new ModelAndView("tuner", "tunerBanner", tunerBanner);
    }
}
