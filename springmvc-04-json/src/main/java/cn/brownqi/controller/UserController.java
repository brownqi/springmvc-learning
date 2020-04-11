package cn.brownqi.controller;

import cn.brownqi.pojo.User;
import cn.brownqi.utils.JsonUtils;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController
public class UserController {

//    @RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")
    @RequestMapping("/j1")
//    @ResponseBody //添加这个注解就不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {

        // jackson ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        //创建一个对象
        User user = new User(1,"齐",10);

        String s = mapper.writeValueAsString(user);

        return s;

    }

    @RequestMapping("j2")
    public String json2() throws JsonProcessingException {
        List<User> userList = new ArrayList<>();

        User user0 = new User(1,"齐",10);
        User user1 = new User(2,"齐",10);
        User user2 = new User(3,"齐",10);
        User user3 = new User(4,"齐",10);
        User user4 = new User(5,"齐",10);

        userList.add(user0);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        return JsonUtils.getJson(userList);
    }

    @RequestMapping("j3")
    public String json3() throws JsonProcessingException {
        Date date = new Date();

        return JsonUtils.getJson(date,"yyyy-MM-dd");

    }

    @RequestMapping("j4")
    public String json4() throws JsonProcessingException {

        User user0 = new User(1,"齐",10);
        User user1 = new User(2,"齐",10);
        User user2 = new User(3,"齐",10);
        User user3 = new User(4,"齐",10);
        User user4 = new User(5,"齐",10);

        List<User> userList = new ArrayList<>();
        userList.add(user0);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        String s = JSON.toJSONString(userList);
        return s;

    }
}