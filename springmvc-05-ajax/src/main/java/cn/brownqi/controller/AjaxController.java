package cn.brownqi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test(){

        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {

        System.out.println("a1:param=>" + name);
        if ("brownqi".equals(name)){
            response.getWriter().println("true");
        }else {
            response.getWriter().println("false");
        }

    }

}
