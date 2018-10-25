package com.codegym.Controller;

import com.codegym.Model.MyTimeZone;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UserController {
    @GetMapping
    public String HomePage(Model model) {
        MyTimeZone myTimeZone = new MyTimeZone();
        model.addAttribute("MyTimeZone", myTimeZone);
        return "index";
    }

    @PostMapping
    public ModelAndView getTimeZone(@ModelAttribute("MyTimeZone") MyTimeZone myTimeZone ) {
        System.out.println(myTimeZone.getTimeZone());
        ModelAndView model = new ModelAndView("index", "convertedTime", myTimeZone.getLocalTime());
        return model;
    }
}
