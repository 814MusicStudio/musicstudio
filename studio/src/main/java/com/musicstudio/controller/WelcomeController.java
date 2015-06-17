package com.musicstudio.controller;

import com.musicstudio.manager.MailManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by linjay on 15/6/16.
 */
@Controller
public class WelcomeController {

//    private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

//    @Resource
//    private MailManager mailManager;

    @RequestMapping("/page/welcome.html")
    public ModelAndView welcome() {
        try {
//            mailManager.sendMail();
        } catch (Exception e) {
            //ignore
        }
        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from com.musicstudio.controller.WelcomeController.java **********</div><br><br>";
        return new ModelAndView("welcome", "message", message);
    }
}
