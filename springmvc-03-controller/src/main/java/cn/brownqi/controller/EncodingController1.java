package cn.brownqi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EncodingController1 {

    //过滤器解决乱码
    @PostMapping("/e/t1")
    public String test(String name , Model model){
         model.addAttribute("msg",name);

        return "test";
    }
}
