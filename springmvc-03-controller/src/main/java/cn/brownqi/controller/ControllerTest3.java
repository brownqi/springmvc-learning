package cn.brownqi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c3")
public class ControllerTest3 {

    @RequestMapping("/h2")
    public String test1(Model model){
        model.addAttribute("msg","ControllerTest3");
        return "test";
    }

}
