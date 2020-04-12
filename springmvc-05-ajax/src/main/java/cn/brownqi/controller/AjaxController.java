package cn.brownqi.controller;

import cn.brownqi.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping("/a2")
    public List<User> a2(){
        ArrayList<User> userList = new ArrayList<>();
        //添加数据
        userList.add(new User("齐",1,"male"));
        userList.add(new User("齐",2,"male"));
        userList.add(new User("齐",3,"male"));
        userList.add(new User("齐",4,"male"));
        userList.add(new User("齐",5,"male"));

        return userList;
    }

}
