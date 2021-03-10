package org.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("user")
@RequestMapping("/user")
public class userInfoController {

    @RequestMapping("/get")
    public String getUserInfo(@RequestParam(name = "id") Integer id){
        return "1";

    }
}
